package br.com.fiap.revisao.model;

public class Endereco {
	
	private String logradouro;
	
	private String numero;
	
	public Endereco() {}
	
	//CTRL + 3 -> gcuf (construtores)
	public Endereco(String logradouro, String numero) {
		this.logradouro = logradouro;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Logradouro: " + logradouro + ", " + numero; 
	}

	//CTRL + 3 -> ggas (getters e setters)
	public String getLogradouro() {
		return logradouro;
	}
	

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}