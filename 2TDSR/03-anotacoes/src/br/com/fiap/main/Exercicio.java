package br.com.fiap.main;

import br.com.fiap.model.Aluno;
import br.com.fiap.model.Produto;
import br.com.fiap.orm.Orm;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar um aluno
		Aluno aluno = new Aluno();
		
		//Instanciar um orm
		Orm orm = new Orm();
		
		//Chamar o método pesquisar passando o aluno e exibir o resultado
		System.out.println(orm.pesquisar(aluno));
		
		//Instanciar um produto
		Produto produto = new Produto();
		
		//Chamar o método pesquisar com o produto
		System.out.println(orm.pesquisar(produto));
		
		System.out.println(orm.pesquisar(Aluno.class));
		System.out.println(orm.pesquisar(Produto.class));
	}
}
