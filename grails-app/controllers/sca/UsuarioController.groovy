package sca

class UsuarioController {
	
	/*O Scaffolding � uma t�cnica utilizada por alguns framework que 
	 * trabalham com o padr�o MVC, que consiste em gerar a partir de um 
	 * modelo, no nosso caso a domain class, o controller e as views 
	 * com os principais opera��es de um CRUD: listagem, inclus�o, 
	 * altera��o e exclus�o.
		No Grails, para executar o Scaffolding vamos acessar o prompt de 
		comandos do Grails atrav�s das teclas Shift+Ctrl+Alt+G e informar
		o seguinte comando: generate-all contatos.Contato.*/	

	/*Mandando executar um scaffod relacionado a classe categoria
	 Isso cria a tabela e cria uma visao na pagina pra que eu possa
	 listar o conteudo ou fazer o crud dele. Por padrao usa o BD HSLDB
	 que foi feito em Java e tem um modo que salva os dados apenas na
	 memoria que � esse setado inicialmente.*/ 
	 def scaffold = Categoria
}
