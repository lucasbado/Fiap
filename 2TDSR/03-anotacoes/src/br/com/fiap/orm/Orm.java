package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {

	//1- Criar a anotação @Tabela, com o parâmetro nome
	//2- Criar a classe Aluno e utilizar a anotação @Tabela
	//3- Implementar o método pesquisar da classe Orm
	//4- Criar a classe para testar, instanciar o Aluno e o Orm e chamar o método pesquisar
	
	public String pesquisar(Object obj) {
		//Recuperar a anotação @Tabela
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		//Concatenar com o parâmetro nome da @Tabela
		return "SELECT * FROM " + anotacao.nome();
	}
	
	// orm.pesquisar(Aluno.class);
	@SuppressWarnings("all")
	public String pesquisar(Class clazz) {
		Tabela anotacao = (Tabela) clazz.getAnnotation(Tabela.class);
		return "SELECT * FROM " + anotacao.nome();
	}
	
}