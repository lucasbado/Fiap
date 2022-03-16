package br.com.fiap.revisao.main;

import java.time.LocalDate;
import java.time.Month;

import br.com.fiap.revisao.model.Endereco;
import br.com.fiap.revisao.model.Funcionario;
import br.com.fiap.revisao.model.FuncionarioTerceiro;
import br.com.fiap.revisao.model.Genero;

public class Teste {

	//Criar o método main
	public static void main(String[] args) {
		
		//Instanciar a classe Funcionario
		Funcionario fun = new Funcionario("João", 1000, 20, true, 7);
		
		//Setar os valores para o objeto
//		fun.setNome("João");
//		fun.setIdade(20);
//		fun.setEstagio(true);
//		fun.setMesesContratado(7);
//		fun.setSalario(2000);
		
		//Chamar os métodos e exibir o resultado
		fun.aumentarSalario();
		System.out.println("Salário atual: " + fun.getSalario());
		
		fun.efetivar();
		System.out.println(fun.isEstagio()?"Estágio":"Efetivado");
		System.out.println("Salário atual: " + fun.getSalario());
		
		//Instanciar a classe FuncionarioTerceiro passando os valores
		FuncionarioTerceiro ft = new FuncionarioTerceiro("Maria", 1000, 21, true, 5, 10);
		
		//Chamar os métodos e exibir o resultado
		ft.aumentarSalario();
		System.out.println("Salário atual do funcionário terceiro: " + ft.getSalario());
		
		ft.efetivar();
		System.out.println(ft.isEstagio()?"Estágio":"Efetivado");
		System.out.println("Salário atual do funcionário terceiro: " + ft.getSalario());
		
		//FuncionarioTerceiro ft2 = new Funcionario("Raissa", 1000); //Não compila!
		
		Funcionario fun2 = new FuncionarioTerceiro("Everton", 1000);
		fun2.aumentarSalario(); //Executa qual implementação? FuncionarioTerceiro
		System.out.println(fun2.getSalario());
		
		//Instanciar um funcionário com todos os dados
		Funcionario juninho = new Funcionario("Juninho", 500, 16, true, 2, 
									Genero.MASCULINO, LocalDate.of(2022, Month.MARCH, 10));
		
		//Adicionar 2 endereços para o funcionário
		juninho.getEnderecos().add(new Endereco("Lins de Vasconcelos", "1222"));
		juninho.getEnderecos().add(new Endereco("Av Paulista", "1100"));
		
		//Exibir os dados do funcionário
		System.out.println(juninho);
		
		//Exibir os endereços do funcionário
		for (Endereco churros : juninho.getEnderecos()) {
			System.out.println(churros);
		}
		
	}//main
}//class