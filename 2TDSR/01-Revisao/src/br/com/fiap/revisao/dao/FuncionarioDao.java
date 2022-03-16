package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Funcionario;

//Interface -> define as regras (contrato) que a classe deve seguir
//define as assinaturas dos métodos que a classe devem implementar

//Interface tem o objetivo de diminuir o acoplamento (dependência) entre os objetos

public interface FuncionarioDao {

	void cadastrar(Funcionario funcionario);
	
	List<Funcionario> listar();
	
}