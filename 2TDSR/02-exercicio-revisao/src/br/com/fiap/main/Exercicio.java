package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class Exercicio {
	
	public static void main(String args[]) {
		//Instanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(123,321,
				new GregorianCalendar(2010, Calendar.APRIL, 4), 100, TipoConta.COMUM);
		
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(12, 3123, Calendar.getInstance(), 100, 2);
		
		//Chamar o metodo depositar
		cc.depositar(100);
		System.out.println("Saldo da conta: " + cc.getSaldo());
		
		cp.depositar(100);
		System.out.println("Saldo da poupança: " + cp.getSaldo());
		
		try {
			//Chamar o metodo retirar
			cc.retirar(300);
			System.out.println("Saldo da conta: " + cc.getSaldo());
		}catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			cp.retirar(300);
			System.out.println("Saldo da poupança: " + cp.getSaldo());
		}catch(SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		//Criar uma lista de conta corrente
		List<ContaCorrente> lista = new ArrayList<>();
		
		//Adicionar 3 contas
		lista.add(cc);
		lista.add(new ContaCorrente(123, 321, Calendar.getInstance(), 990, TipoConta.ESPECIAL));
		lista.add(new ContaCorrente(321, 321, Calendar.getInstance(), 1000, TipoConta.PREMIUM));
		
		//Exibir os saldos das contas
		System.out.println("Saldos:");
		for (ContaCorrente item : lista) {
			System.out.println(item.getSaldo());
		}
		
		System.out.println("Finalizando o sistema...");
	}//main
}//class
