package Testes;

import java.util.Locale;
import java.util.Scanner;

public class Ex_88 {
//Aula sobre vetores
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n]; // aqui foi criado o vetor com o nome vect q vai receber a quantidade de
										// possições/blocos do valor n
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		double som = 0.0;
		for (int i = 0; i < n; i++) {
			som += vect[i];
		}
		double avg = som / n;
		System.out.printf("Avarage Height: %.2f%n", avg);
		sc.close();
	}

}
