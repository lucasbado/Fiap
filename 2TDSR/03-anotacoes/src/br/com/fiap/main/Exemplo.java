package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.model.Produto;

public class Exemplo {
	
	public static void main(String[] args) {
		//Instanciar um Produto
		Produto produto = new Produto();
		
		//API Reflection
		//Exibir o nome da classe do objeto
		System.out.println(produto.getClass().getName());
		
		//Recuperar os atributos do objeto
		//Field[] atributos = produto.getClass().getDeclaredFields();
		Field[] atributos = Produto.class.getDeclaredFields();
		
		//Exibir os nomes e os tipos
		System.out.println("ATRIBUTOS");
		for (Field atributo : atributos) {
			System.out.println(atributo.getName() + " - " + atributo.getType());
			//Recuperar a anotação @Coluna de cada atributo
			Coluna anotacao = atributo.getAnnotation(Coluna.class);
			
			//Exibir as configurações, nome, chave, tamanho, obrigatório
			System.out.println("Nome do campo: " + anotacao.nome());
			System.out.println("Tamanho: " + anotacao.tamanho());
			System.out.print(anotacao.chave()?"Primary Key ":"");
			System.out.println((anotacao.obrigatorio()?"Not null":"") + "\n");
		}
		
		//Recuperar os métodos do objeto
		Method[] metodos = produto.getClass().getDeclaredMethods();
		
		//Exibir os nomes dos métodos
		System.out.println("MÉTODOS");
		for (Method metodo : metodos) {
			System.out.println(metodo.getName());
		}
		
	}//main
}//class