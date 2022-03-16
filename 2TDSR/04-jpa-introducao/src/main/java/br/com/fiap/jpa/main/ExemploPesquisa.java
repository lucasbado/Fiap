package br.com.fiap.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;

public class ExemploPesquisa {

	
	public static void main (String[] args) {
		//obter a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Obter o entity manager
		EntityManager em = fabrica.createEntityManager();
		//Pesquisar o clinte pela PK
		Cliente cliente = em.find(Cliente.class,1); //Classe, PK
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		 //Alterar o nome
		cliente.setNome("Rodrigo");
		
		//commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		//Fechar
		em.close();
		fabrica.close();
	}
}
