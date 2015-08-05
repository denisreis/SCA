dataSource {
    pooled = true
    jmxExport = true
    //driverClassName = "org.h2.Driver"
	//driverClassName = "com.mysql.jdbc.Driver"
	driverClassName = "org.postgresql.Driver"
	dialect = "org.hibernate.dialect.PostgreSQLDialect"
    //username = "sa"
    //password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    //cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
	cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    //singleSession = true // configure OSIV singleSession mode
    //flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    development {		
		dataSource {
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:postgresql://localhost:5432/estoque"
			username = "estoque"
			password = "estoque"

			//url = "jdbc:mysql://localhost/estoque"
			//username = "estoque"
			//password = "estoque"
			/*ORIGINAL
        	dataSource {
            	dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            	url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"            
        	}*/
		}
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }
    production {
        dataSource {
			dbCreate = "update" // one of 'create', 'create-drop','update'
			/*Teste1 com Heroku - 04/08/15
			 * Com as linhas abaixo descomentadas da erro local, mas funciona no heroku,
			 * da erro, mas apenas no index do usuario		
			 */
			/*uri = new URI(System.env.DATABASE_URL?:"postgres://test:test@localhost/test")			
			url = "jdbc:postgresql://"+uri.host+uri.path		  
			username = uri.userInfo.split(":")[0]			
			password = uri.userInfo.split(":")[1]*/
						  
			/*Teste2 com Heroku - 04/08/15
			 * Testar o compartamento das linhas abaixo depois de instalar o plug do heroku
			 */			
			url = "jdbc:postgres://ovgxtjbcovidcm:58i6CULkzIMDZQlpRGNjpy9XiP@ec2-54-83-41-183.compute-1.amazonaws.com:5432/d8v1c2ufprgah"
			username = "ovgxtjbcovidcm"
			password = "58i6CULkzIMDZQlpRGNjpy9XiP"					
            //dbCreate = "create-drop"
            //url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            /*properties {
               // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
               jmxEnabled = true
               initialSize = 5
               maxActive = 50
               minIdle = 5
               maxIdle = 25
               maxWait = 10000
               maxAge = 10 * 60000
               timeBetweenEvictionRunsMillis = 5000
               minEvictableIdleTimeMillis = 60000
               validationQuery = "SELECT 1"
               validationQueryTimeout = 3
               validationInterval = 15000
               testOnBorrow = true
               testWhileIdle = true
               testOnReturn = false
               jdbcInterceptors = "ConnectionState"
               defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED*/
            }
        }
    }
}
