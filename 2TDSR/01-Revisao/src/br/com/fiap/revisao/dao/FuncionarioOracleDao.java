package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Funcionario;

public class FuncionarioOracleDao implements FuncionarioDao {

	@Override
	public void cadastrar(Funcionario funcionario) {
		System.out.println("Cadastrando um funcionário...");
	}

	@Override
	public List<Funcionario> listar() {
		System.out.println("Pesquisando os funcionários...");
		return null;
	}

}