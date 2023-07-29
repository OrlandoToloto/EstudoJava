package Testes;

import javax.swing.Spring;

public class EX_fixassao {

	private int number;
	private String holder;
	private double balance;

	public EX_fixassao(int number, String holder) {

		this.number = number;
		this.holder = holder;
	}

	public EX_fixassao(int number, String holder, double initialDeposit) {

		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}
	public String toString() {
		return "EX_fixassao"
				+ number
				+ ", holder: "
				+ holder
				+ " , Balance: $ "
				+ String.format("%.2f",balance);
	}
}
