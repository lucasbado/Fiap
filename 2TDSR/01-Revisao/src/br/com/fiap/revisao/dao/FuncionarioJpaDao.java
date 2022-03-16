package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Funcionario;

public class FuncionarioJpaDao implements FuncionarioDao {

	@Override
	public void cadastrar(Funcionario funcionario) {
		System.out.println("Cadastrar...");
	}

	@Override
	public List<Funcionario> listar() {
		System.out.println("Listar..");
		return null;
	}
	
}