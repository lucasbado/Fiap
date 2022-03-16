package br.com.fiap.revisao.main;

import br.com.fiap.revisao.dao.FuncionarioDao;
import br.com.fiap.revisao.dao.FuncionarioOracleDao;
import br.com.fiap.revisao.model.Funcionario;

public class TesteInterface {
	
//	private static FuncionarioDao dao;
//	
//	public TesteInterface(FuncionarioDao dao) {
//		this.dao = dao;
//	}

	public static void main(String[] args) {
		
		FuncionarioDao dao = new FuncionarioOracleDao();
		
		//Chamar os métodos cadastrar e pesquisar
		dao.cadastrar(new Funcionario("João", 1000));
		dao.listar();
		
	}
}