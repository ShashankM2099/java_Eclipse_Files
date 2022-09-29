package helloWorld;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Scanner;

public class WithdrawalBank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = 10000;
		System.out.println("Welcome to Bank!!! How can I help you");
		System.out.println("## Press B for Balance, W for withdrawing and D for depositing");
		String option = input.next();
		if (option.equals("B")) {
			System.out.println(balance);
		} else if (option.equals("W")) {
			System.out.println("How much are u withdrawing today?");
			int withdrawal = input.nextInt();
			balance = (balance - withdrawal);
			System.out.println("Ur new balance after withdrawal is: " + balance);
		} else if (option.equals("D")) {
			System.out.println("How much are u depositing today?");
			int deposit = input.nextInt();
			balance = (balance + deposit);
			System.out.println("Ur new balance after deposting is: " + balance);

		}

	}
}
