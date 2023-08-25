package Testes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex_110 {// Instanciamento de data e hora

	public static void main(String[] args) {
		LocalDate D01 = LocalDate.now();
		LocalDateTime D02 = LocalDateTime.now();
		Instant D03 = Instant.now();

		LocalDate D04 = LocalDate.parse("2020-07-06");
		LocalDateTime D05 = LocalDateTime.parse("2020-07-06T01:50:01");
		Instant D06 = Instant.parse("2020-07-06T01:50:01Z");

		System.out.println("D01 = " + D01.toString()); // de forma implicita ele ja ta fazendo o toString, o toString
														// faz com q fique no formato iso 8601
		System.out.println("D02 = " + D02);
		System.out.println("D03 = " + D03); // horario de londrez
		System.out.println("D04 = " + D04);
		System.out.println("D05 = " + D05);
		System.out.println("D06 = " + D06);
	}

}
