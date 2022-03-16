package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Código (.java) -- Compilação --> Bytecode (.class) -- Interpretar na JVM --> Execução

//Retention -> define até quando a anotação será mantida (Código, Compilado, Execução)
@Retention(RetentionPolicy.RUNTIME)
//Target -> define o lugar onde a anotação pode ser utilizada
@Target( { ElementType.FIELD, ElementType.METHOD }) //FIELD -> atributos
public @interface Coluna {

	String nome(); //parâmetro da anotação
	boolean chave() default false; //parâmetro com valor padrão é opcional
	int tamanho() default 0;
	boolean obrigatorio() default false;
	
}