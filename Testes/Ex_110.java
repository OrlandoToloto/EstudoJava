package Testes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex_110 {// Instanciamento de data e hora

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate D01 = LocalDate.now();
		LocalDateTime D02 = LocalDateTime.now();
		Instant D03 = Instant.now();

		LocalDate D04 = LocalDate.parse("2020-07-06");
		LocalDateTime D05 = LocalDateTime.parse("2020-07-06T01:50:01");
		Instant D06 = Instant.parse("2020-07-06T01:50:01Z");
		Instant D07 = Instant.parse("2020-07-06T01:50:01-03:00");
		LocalDate d08 = LocalDate.parse("27/10/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("17/10/2023 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2023, 10, 27);
		LocalDateTime d11 = LocalDateTime.of(2023, 10, 27, 1, 30);
		
		System.out.println("D01 = " + D01.toString()); // de forma implicita ele ja ta fazendo o toString, o toString
														// faz com q fique no formato iso 8601
		System.out.println("D02 = " + D02);
		System.out.println("D03 = " + D03); // horario de londrez
		System.out.println("D04 = " + D04);
		System.out.println("D05 = " + D05);
		System.out.println("D06 = " + D06);
		System.out.println("D07 = " + D07);
		System.out.println("D08 = " + d08.toString());
		System.out.println("D09 = " + d09.toString());
		System.out.println("D10 = " + d10.toString());
		System.out.println("D11 = " + d11.toString());
	}
}
