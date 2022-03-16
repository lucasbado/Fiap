package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDatas {

	public static void main(String[] args) {
		//Criar um Calendar com a data atual
		Calendar hoje = Calendar.getInstance();
		
		//Criar um Calendar com a data da aula de reposição (07/03/2022 19:00)
		Calendar reposicao = new GregorianCalendar(2022, Calendar.MARCH, 7, 19, 0);
		
		//Formatador de Date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Exibir as datas
		System.out.println(sdf.format(hoje.getTime()));
		System.out.println(sdf.format(reposicao.getTime()));
		
		//Criar uma data atual
		LocalDate dataHoje = LocalDate.now();
		
		//Criar a data de apresentação da challenge 25/05/2022
		LocalDate dataApresentacao = LocalDate.of(2022, Month.AUGUST, 25);
		
		//Criar a hora atual
		LocalTime horaAtual = LocalTime.now();
		
		//Criar a hora do inicio do intervalo
		LocalTime horaIntervalo = LocalTime.of(21, 0);
		
		//Criar a data e hora atuais
		LocalDateTime dataHoralAtual = LocalDateTime.now();
		
		//Criar a data e hora da colação de grau 03/03/2023 20:00
		LocalDateTime dataColacao = LocalDateTime.of(2023, 3, 3, 20, 0);
		
		//Exibir as datas
		//Padrão de data
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(dataHoje.format(formataData));
		System.out.println(dataApresentacao.format(formataData));
		
		//Padrão de Horas
		DateTimeFormatter formataHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println(horaAtual.format(formataHora));
		System.out.println(horaIntervalo.format(formataHora));
		
		//Padrão de data e hora
		DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(dataHoralAtual.format(formataDataHora));
		System.out.println(dataColacao.format(formataDataHora));
		
	}//main
}//class