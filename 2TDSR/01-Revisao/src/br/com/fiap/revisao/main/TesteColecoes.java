package br.com.fiap.revisao.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fiap.revisao.model.Funcionario;

public class TesteColecoes {
	
	public static void main(String[] args) {
		//Criar uma lista de Funcionário
		List<Funcionario> lista = new ArrayList<>();
		
		//Adicionar 2 funcionários na lista
		Funcionario func = new Funcionario("Leandro", 10000, 20, false, 19);
		lista.add(func);
		lista.add(func); //item repetido
		
		lista.add(new Funcionario("Matheus", 10000, 21, false, 18));
		
		//Exibir os dados do funcionário
		System.out.println("FOR");
		for (int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
			
		System.out.println("FOREACH");
		for (Funcionario item : lista) {
			System.out.println(item);
		}
		
		//Criar um Set de funcionário
		Set<Funcionario> conjunto = new HashSet<Funcionario>();
		
		//Adicionar 3 funcionários, sendo 1 repetido
		conjunto.add(func);
		conjunto.add(func); //item repetido, será ignorado
		conjunto.add(new Funcionario("Everton", 10000, 19, false, 19));
		
		//Exibir os funcionários do conjunto
		System.out.println("CONJUNTO");
		for (Funcionario item : conjunto) {
			System.out.println(item);
		}
		
		//Criar um mapa com a chave do tipo Integer e o valor do tipo funcionário
		Map<Integer, Funcionario> mapa = new HashMap<Integer, Funcionario>();
		
		//Mapear (adicionar) dois funcionários
		mapa.put(123, func);
		mapa.put(321, new Funcionario("Jackie Chan", 999232, 20000, false, 50));
		
		//mapa.put(321, func); //adicionar um valor com a mesma chave, substitui o valor
		
		//Recuperar o funcionário através da chave
		System.out.println("MAPA");
		System.out.println(mapa.get(321));
		
		//Recuperar as chaves do mapa
		Set<Integer> chaves = mapa.keySet();
		//Exibir as chaves e os valores
		System.out.println("CHAVES e VALORES DO MAPA");
		for (Integer chave : chaves) {
			System.out.println(chave + " - " + mapa.get(chave));
		}
		
	}//main
}//class