package br.com.fiap.jpa.main;
import java.time.*;
import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;
import br.com.fiap.jpa.entity.Genero;

public class ExemploAtualizacao {

	public static void main(String[] args) {
		
		//Obter uma fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Obter um entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um cliente com codigo (detached)
		Cliente cliente = new Cliente(3, "Daniel Jorge", "Jorasuadhsge@gmail.com", new BigDecimal("500"), LocalDate.now() , null, Genero.MASCULINO);
		//Atualizar no banco
		Cliente copia = em.merge(cliente);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		  copia.setNome("Rafael");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		//Fechar
		em.close();
		fabrica.close();
		
		
	}
	
	
	
}
