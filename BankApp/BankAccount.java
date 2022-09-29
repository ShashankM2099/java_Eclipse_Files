package BankApp;

import java.util.Scanner;

/**
 * @author Shashank
 *@category BankMockApplication
 *A simple bank application to mimic banks
 *Features: Add Money
 */
public class BankAccount {
	String name;
	String id;

	public BankAccount(String name, String id) {
		this.name = name;
		this.id = id;
	}

	double balance;
	double prevTransaction;

	/*
	 * Description: To depositMoney check if the balance is not empty if not, add amount
	 * to balance and prevT is the new amount
	 */
	void deposit(double amount) { // param: deposited Amount 
		/*
		 * if deposited money is not zero, add that money to balance
		 */
		if (amount != 0) {
			balance += amount;
			prevTransaction = amount;
			System.out.println("Deposited Money:  "+ amount);
			System.out.println("Total: "+ amount);
		} else {
			System.out.println("No funds were added");
		}
	}

	/*
	 * Description: To withdraw money, make sure balance is not zero and amount is
	 * not greater than balance if so cut balance from withdraw money i.e: amount -
	 * balance: 1000-750 :=250
	 */
	void withdrawMoney(double amount) {
		if (amount != 0 && amount <= balance) {
			balance -= amount;
			prevTransaction =-amount;
			System.out.println("Withdrawn Money: "+ amount);
			System.out.println("Total Balance: "+ balance);
		} else {
			System.out.println("Insufficient Funds");
		}
	}

	void getPrevTransaction() {
		if (prevTransaction > 0) {
			System.out.println("Account Holder: " + name);
			System.out.println("Account ID: " + id);
			System.out.println("Deposited: " + prevTransaction);
		} else if (prevTransaction < 0) {
			System.out.println("Account Holder: " + name);
			System.out.println("Account ID: " + id);
			System.out.println("Withdrawn: " + Math.abs(prevTransaction));
		}

	}

	void displayMenu() {
		char option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome " + name);
		System.out.println("Your Account ID:" + id);
		System.out.println("\n");
		System.out.println("a): Check your Accounts Balance: ");
		System.out.println("b) : Deposit Amount: ");
		System.out.println("c) : Withdraw Amount: ");
		System.out.println("d) Get my Previous Transaction");
		System.out.println("e) Exit");
		do {
			System.out.println("Choose an option");
            option=sc.next().charAt(0);
            System.out.println("\n");
			switch(option) {
			case 'a': // getBalance
				System.out.println("Balance: "+ balance);
				break;
			case 'b': //deposit money
				System.out.println("Enter an amount to deposit money");
				double moneyDeposited = sc.nextDouble();
				deposit(moneyDeposited);
				break;
			case 'c': // withdraw money
				System.out.println("Enter an amount to withdraw money");
				double withdrawAmt = sc.nextDouble();
				withdrawMoney(withdrawAmt);
				break;
			case 'd': //get PrevTransaction
				getPrevTransaction();
			}
		}while(option!='e'); {
			if(option =='e') {
				System.out.println("Thanks, \nHope we will see you again!!!");
			}
		}
		sc.close();
	}

}
