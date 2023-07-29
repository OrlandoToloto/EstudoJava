package Entities;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.Spring;

import Testes.EX_fixassao;

// essa classe está vinculada a classe de ex de fixação
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		EX_fixassao account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n) ? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new EX_fixassao(number, holder, initialDeposit);
		} else {
			account = new EX_fixassao(number, holder);
		}
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.deposit(withdrawValue);
		System.out.println("updated account data:");
		System.out.println(account);
		sc.close();
	}

}
