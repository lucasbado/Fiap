package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	//CTRL + d -> apaga a linha
	//CTRL + 1 -> quick fix
	
	//Atributo
	private double taxa;
	
	//Constante
	//final -> atributo: não permite a alteração, 
	//		   método: não permite a sobrescrita, 
	//		   classe: não permite a herança
	//static -> define o elemento como sendo da classe e não do objeto
	public static final float RENDIMENTO = 0.05f;
	
	//Construtores
	public ContaPoupanca() {}
	
	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, double taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}

	//Métodos
	@Override
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}
	
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Validar se o saldo eh suficiente junto da taxa de retirada
		if (saldo < valor + taxa) {
			throw new SaldoInsuficienteException(saldo - taxa);
		}
		saldo -= valor + taxa;
	}

	//Getter e Setter
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}