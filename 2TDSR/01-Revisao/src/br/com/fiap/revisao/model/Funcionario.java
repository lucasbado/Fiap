package br.com.fiap.revisao.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	//Modificadores de acesso
	//private -> somente a própria classe
	//default/package -> a classe, classes no mesmo pacote,
	//protected -> a classe , classes no mesmo pacote, classes filhas
	//public -> todos
	
	//Atributos 
	//Valores padrões: números: 0; boolean: false; Referência: null
	private String nome;
	private int idade;
	private double salario;
	private boolean estagio;
	private int mesesContratado; //Qtd de meses trabalhado
	
	private Genero genero;
	
	private LocalDate dataDemissao;
	
	private List<Endereco> enderecos = new ArrayList<>();
	
	public Funcionario(String nome, double salario, int idade,
			boolean estagio, int mesesContratado, Genero genero, LocalDate dataDemissao) {
		this(nome, salario, idade, estagio, mesesContratado);
		this.genero = genero;
		this.dataDemissao = dataDemissao;
	}
	
	//Construtor -> método especial utilizado na instanciação da classe
	//1 - Tem o mesmo nome da classe
	//2 - Não tem retorno, nem void
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	//Criar um construtor com todos os atributos
	public Funcionario(String nome, double salario, int idade, 
									boolean estagio, int mesesContratado) {
		this(nome, salario); // chama o construtor que possui 2 parâmetros
		this.idade = idade;
		this.estagio = estagio;
		this.mesesContratado = mesesContratado;
	}
	
	//Métodos
	//Sobrecarga (Overload) -> método com o mesmo nome, mas com parâmetros diferentes
	//Parâmetros diferentes? com tipos diferentes ou na quantidade diferentes
							// Ex, 10(%), 20(%)
	public void aumentarSalario(double porcentagem) {
		salario += salario*porcentagem/100;
	}
	
	public void aumentarSalario(double valor, boolean bonus) {
		//Se tiver bonus -> salario recebe o valor dobrado, se não recebe o valor
		salario += bonus? valor*2 : valor;
	}
	
	public void aumentarSalario() {
		//Aumenta o salário em 10%
		salario *= 1.1; //salario = salario * 1.1;
	}
	
	public void efetivar() {
		//Validar se o estágiário pode ser contratado
		if (validarEfetivacao()) {
			//Aumenta o valor do salário em 10% e muda a flag do estágio
			aumentarSalario();
			estagio = false;
		}
	}
	
	private boolean validarEfetivacao() {
		//Valida se o funcionário é estagiário e tem mais de 6 meses na empresa
//		if (this.mesesContratado > 6 && estagio) {
//			return true;
//		} 
//		return false;
		//Operador ternário -> (condição) ? Se verdadeiro : Se falso;
		//return (mesesContratado > 6 && estagio) ? true : false;
		return mesesContratado > 6 && estagio;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Nome: " + nome + " Salário: " + salario + 
				" Meses Contratado: " + mesesContratado + " Idade: " + idade + 
				(estagio?" Estágio":" Efetivado") + " Gênero: " + genero.texto 
				+ " Data Demissão: " + dataDemissao.format(formato);
	}
	
	//Getters e Setters - Criar 1 get e 1 set
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isEstagio() {
		return estagio;
	}

	public void setEstagio(boolean estagio) {
		this.estagio = estagio;
	}

	public int getMesesContratado() {
		return mesesContratado;
	}

	public void setMesesContratado(int mesesContratado) {
		this.mesesContratado = mesesContratado;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}