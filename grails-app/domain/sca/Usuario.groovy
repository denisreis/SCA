package sca

class Usuario {
	String nome
	
	/*O grails gera um combo box e o comando abaixo diz que ne nele deve
	 aparecer o nome da categoria. Se nao tiver esse comando aparece
     estoque.Categoria*/
	String toString() {
	 this.nome
	}
    
    /*Regras de validacao. Mais no doc do grails no site.
    http://grails.github.io/grails-doc/latest/guide/introduction.html*/	
    static constraints = {
		/*nao pode ser nulo, n em branco, maximo 32 caracteres, nao se repete.
		vai criar a tabela com essas restricoes*/
		nome(nullable:false, blank:false, maxSize:32, unique:true)
    }
}
