package br.com.fiap.jpa.entity;

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

@Entity
@Table(name="TB_EMPRESA")
@SequenceGenerator(name="empresa", sequenceName = "SQ_TB_EMPRESA",allocationSize = 1)
public class Empresa {

	@Id
	@Column(name="cd_empresa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "empresa")
	private Integer codigo;
	
	@Column(name="nm_empresa", length = 100, nullable = false)
	private String nome;
	
	@Column(name="nr_cnpj", length = 20, nullable = false)
	private String cnpj;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo", length = 30)
	private TipoEmpresa tipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_cadastro", nullable = false, updatable = false)
	private Calendar dataCadastro;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_fundacao")
	private Calendar dataFundacao;
	
	@Lob
	@Column(name="fl_contrato_social")
	private byte[] foto;
	
	@Column(name="st_ativo")
	private Boolean ativo;
	
	@Transient
	private Integer quantidadeFuncionarios;

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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public TipoEmpresa getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpresa tipo) {
		this.tipo = tipo;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
}
