package br.com.fiap.exception;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente, valor disponível: " + valor);
	}
	
}