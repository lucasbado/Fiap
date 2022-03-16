package br.com.fiap.revisao.model;

//Herança
//Object <- Funcionario <- FuncionarioTerceiro

//Herança? É um? 
//Atributo? Tem um? 
//FuncionarioTerceiro é um Funcionario
public class FuncionarioTerceiro extends Funcionario {

	//Atributos
	private int tempoContrato; //tempo para prestar o serviço
	
	private Empresa empresa; //FuncionarioTerceiro tem uma empresa
	
	//Construtores? São herdados? Não!
	//O construtor da classe filha precisa chamar um construtor da classe pai
	public FuncionarioTerceiro(String nome, double salario) {
		super(nome, salario);//Chama o construtor do pai
	}

	//Criar o construtor com todos os atributos
	public FuncionarioTerceiro(String nome, double salario, int idade, boolean estagio,
									int mesesContratado, int tempoContrato) {
		super(nome, salario, idade, estagio, mesesContratado);
		this.tempoContrato = tempoContrato;
	}
	
	//Métodos
	
	//Sobrescrita (Override) -> Anotação @Override
	//Mesmo método do pai implementado na classe filha
	@Override
	public void aumentarSalario() {
		//Aumento de 5%
		//salario *= 1.05; //Alterar a visibilidade para protected
		aumentarSalario(5); 
	}

	//Getters e Setters
	public int getTempoContrato() {
		return tempoContrato;
	}

	public void setTempoContrato(int tempoContrato) {
		this.tempoContrato = tempoContrato;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}