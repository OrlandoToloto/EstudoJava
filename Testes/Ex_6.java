package Testes;

import java.util.Scanner;

public class Ex_6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
	/**
	 * Ler um número inteiro N e calcular todos os seus divisores.
	 */
}
