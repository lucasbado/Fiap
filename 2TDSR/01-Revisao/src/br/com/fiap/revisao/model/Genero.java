package br.com.fiap.revisao.model;

//Conjunto de constantes
public enum Genero {

	//Cada constante invoca o construtor informando o label
	FEMININO("Feminino"), MASCULINO("Masculino"), 
	OUTROS("Outros"), NAO_BINARIO("Não binário");

	//Label para cada constante
	public final String texto;
	
	//Construtor do enum
	private Genero(String texto) {
		this.texto = texto;
	}
	
}