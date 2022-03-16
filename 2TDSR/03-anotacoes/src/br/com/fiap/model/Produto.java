package br.com.fiap.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TB_PRODUTO")
public class Produto {

	@Coluna(nome = "cd_produto", chave =true, obrigatorio = true) 
	private int codigo;
	
	@Coluna(nome = "nm_produto", tamanho = 100, obrigatorio = true)
	private String nome;
	
	@Coluna(nome = "ds_produto")
	private String descricao;
	
	@Coluna(nome = "vl_produto")
	private BigDecimal valor;
	
	@Coluna(nome = "dt_cadastro")
	private LocalDate dataCadastro;

	@Coluna(nome="")
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
}