package LO6;

import java.util.*;

public class lab06Method {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int mainMenuChoice = -1;
		System.out.println("Welcome to the coffee shop!");

		double total = 0.0;

		do {
			displayMainMenu();
			mainMenuChoice = scan.nextInt();
			char selection;

			switch (mainMenuChoice) {
			case 1:
				coffeeSubmenu();
				selection = scan.next().charAt(0);
				total += calculateCoffeePrice(selection);
				System.out.println(total);
				break;
			case 2:
				pastrySubmenu();
				selection = scan.next().charAt(0);
				total += calculatePastryPrice(selection);
				System.out.println(total);
				break;
			case 3:
				sodaSubmenu();
				selection = scan.next().charAt(0);
				total += calculateSodaPrice(selection);
				System.out.println(total);
				break;
			case 4:
				System.out.println(" Thanks For Coming..See ya..and.\n Do not forget to wash your Hands");
			}

		} while (mainMenuChoice != 4);

		System.out.println("Total: $" + total);
	}

	private static double calculatePastryPrice(char selection) {
		double price = 0.0;
		if (selection == 'A') {
			price = 4.99;
		} else if (selection == 'B') {
			price = 2.49;
		}
		return price;
	}

	private static double calculateSodaPrice(char selection) {
		// TODO Auto-generated method stub
		double price = 0.0;
		if (selection == 'A') {
			price = 2.99;

		} else if (selection == 'B') {
			price = 2.49;
		}
		return price;
	}

	public static double calculateCoffeePrice(char selection) {
		double price = 0.0;
		if (selection == 'A') {
			price = 2.99;
		} else if (selection == 'B') {
			price = 3.99;
		}
		return price;
	}

	public static void displayMainMenu() {
		System.out.println("Please select the item type.");
		System.out.println("1. Coffee");
		System.out.println("2. Pastry");
		System.out.println("3. Soda");
		System.out.println("4. Exit");

	}

	public static void coffeeSubmenu() {
		System.out.println("Please select the coffee.");
		System.out.println("A. Drip Coffee");
		System.out.println("B. Latte");
	}

	public static void pastrySubmenu() {
		System.out.println("Please select the pastry.");
		System.out.println("A. Croissant");
		System.out.println("B. Muffin");
	}

	public static void sodaSubmenu() {
		System.out.println("Please select a soda.");
		System.out.println("A. Coca-Cola");
		System.out.println("B. Pepsi");
	}

}
