package Testes;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rent_Ex94;

public class Ex94_pensionato {
/**
 * Nessa classe foi feito, um app para um "hotel" onde tera de 0 a 9 quartos em q pode 
 * chegar uma pessoa e pedir o quarto desejado, dando de info. o nome e o email mais o numero do quarto
 * @param args
 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent_Ex94[] vect = new Rent_Ex94[10];
		
		System.out.print("how many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			Rent_Ex94 rent = new Rent_Ex94(name,email);
			vect [roomNumber] = rent;
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
sc.close();
	}

}
