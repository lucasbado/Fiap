package br.com.fiap.bean;

import java.util.Calendar;
import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	//Atributo
	private TipoConta tipo;
	
	//Construtores
	
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, 
													double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	@Override //garantir a sobrescrita
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Validar se a conta é comum e o saldo fica negativo depois do saque
		if (tipo == TipoConta.COMUM && saldo < valor ) {
			//Lançar uma exception
			//Exception -> checked, checadas em tempo de compilação
			//RuntimeException -> unchecked, exceptions de tempo de execução
			throw new SaldoInsuficienteException(saldo);
		} 
		saldo -= valor; //saldo = saldo - valor;
	}

	//Getter e Setter
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}