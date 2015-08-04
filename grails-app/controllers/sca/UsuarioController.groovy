package sca

class UsuarioController {
	
	/*O Scaffolding é uma técnica utilizada por alguns framework que 
	 * trabalham com o padrão MVC, que consiste em gerar a partir de um 
	 * modelo, no nosso caso a domain class, o controller e as views 
	 * com os principais operações de um CRUD: listagem, inclusão, 
	 * alteração e exclusão.
		No Grails, para executar o Scaffolding vamos acessar o prompt de 
		comandos do Grails através das teclas Shift+Ctrl+Alt+G e informar
		o seguinte comando: generate-all contatos.Contato.*/	

	/*Mandando executar um scaffod relacionado a classe categoria
	 Isso cria a tabela e cria uma visao na pagina pra que eu possa
	 listar o conteudo ou fazer o crud dele. Por padrao usa o BD HSLDB
	 que foi feito em Java e tem um modo que salva os dados apenas na
	 memoria que é esse setado inicialmente.*/ 
	 def scaffold = Categoria
}
