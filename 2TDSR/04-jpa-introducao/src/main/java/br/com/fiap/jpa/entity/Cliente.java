package br.com.fiap.jpa.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TB_CLIENTE")
					//nome no Java, nome no banco, incremento
@SequenceGenerator(name="cliente", sequenceName = "SQ_TB_CLIENTE", allocationSize = 1)
public class Cliente {

	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	private Integer codigo;
	
	@Column(name="nm_cliente", length = 80, nullable = false) //nullable -> pode ser nulo?
	private String nome;
	
	@Column(name="ds_email", unique = true, length = 50)
	private String email;
	
	@CreationTimestamp //Criar a data de cadastro automáticamente
	@Temporal(TemporalType.TIMESTAMP) //armazena a data e hora no banco, utilizado com Calendar
	@Column(name="dt_cadastro", nullable = false, updatable = false) //updatable -> será atualizado?
	private Calendar dataCadastro;
	
	@Column(name="st_ativo", insertable = false)//insertable -> será cadastrado?
	private Boolean ativo;
	
	@Column(name="vl_credito")
	private BigDecimal credito;
	
	@Column(name="dt_nascimento")
	private LocalDate dataNascimento;
	
	@Transient //o atributo não será uma coluna na tabela
	private Integer idade;
	
	@Lob // define um campo do tipo blob no oracle, para arquivos
	@Column(name="fl_foto_cnh")
	private byte[] fotoCnh;
	
	@Enumerated(EnumType.STRING) // define que será gravado o texto da constante e não a posição
	@Column(name="ds_genero", length = 40)
	private Genero genero;
	
	public Cliente() {}
	
	public Cliente(String nome, String email, BigDecimal credito, LocalDate dataNascimento,
			byte[] fotoCnh, Genero genero) {
		super();
		this.nome = nome;
		this.email = email;
		this.credito = credito;
		this.dataNascimento = dataNascimento;
		this.fotoCnh = fotoCnh;
		this.genero = genero;
	}
	
	public Cliente(Integer codigo, String nome, String email, BigDecimal credito, LocalDate dataNascimento,
			byte[] fotoCnh, Genero genero) {
		this(nome, email, credito, dataNascimento, fotoCnh, genero);
		this.codigo = (codigo);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public BigDecimal getCredito() {
		return credito;
	}

	public void setCredito(BigDecimal credito) {
		this.credito = credito;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public byte[] getFotoCnh() {
		return fotoCnh;
	}

	public void setFotoCnh(byte[] fotoCnh) {
		this.fotoCnh = fotoCnh;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}