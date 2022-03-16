package br.com.fiap.jpa.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {
	
	public static void main(String[] args) {
		
							//nome da persistence unit definido no arquivo persistence.xml
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		fabrica.close();
		
	}
}