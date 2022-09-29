package LAB03;

import java.util.Scanner;

import ID001.ShowingCurrentTime;

public class Act08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ---- Declare all the variables here
		int choice = 0, num = 0;
		double total = 0;
		Scanner scan;
		final double tax = 0.023;

		// -----------------------------------

		showMenu();
		// On the next line, write the code to scan an integer called choice. Use the
		// necessary input
		//
		choice = input.nextInt();

		if (choice == 1) {
			System.out.println("how many shirts wud U like to buy?");
			int shirts = input.nextInt();
			total = shirts * 7.00;
			System.out.println("Your total is: " + (total));
			// Here, ask the user how many shirts they would like to buy. Based on that
			// quantity and the price per shirt, calculate the total.
			//

		} else if (choice == 2) {
			System.out.println("how many Pants wud U like to buy?");
			int pants = input.nextInt();
			total = pants * 10.00;
			System.out.println("Your total is: " + (total));
			// Here, ask the user how many pants they would like to buy. Based on that
			// quantity and the price per pants, calculate the total.
			//
		} else if (choice == 3) {
			System.out.println("how many Tops wud U like to buy?");
			int top = input.nextInt();
			total = top * 5.00;
			System.out.println("Your total is: " + (total));
			// Here, ask the user how many top they would like to buy. Based on that
			// quantity and the price per top, calculate the total.
			//
		}
		total += total * tax; //

		System.out.println("Hello Customer, Thank you for your purchase at our store.");
		// below, write the code to print the total bill
		System.out.println("Your total bill was : " + total);

	}

	public static void showMenu() {
		System.out.println("Please select 1 of the following options to buy: ");
		System.out.println("1. Shirts (7$ / item)");
		System.out.println("2. Pants  (10$ / item)");
		System.out.println("3. Top    (5$ / item)");
	}
}
