package Testes;

import java.util.Locale;
import java.util.Scanner;

import Entities.Ex89_vetores;

public class Ex_89 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Ex89_vetores[] vect = new Ex89_vetores[n];
		for (int i = 0; i < 0; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Ex89_vetores(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < 0; i++) {
			sum += vect[i].getPrice();

		}
		double avg = sum / n;
		System.out.printf("Avarage price = %.2f%n", avg);
		sc.close();
	}
}
