package LAB03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Act01 {
	public static void main(String[] args) throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		int flip = (int) (Math.random() * 2) + 1;
		System.out.println("Welcome!!! Flip a coin to get your discount");
		System.out.println("50/50 Chance to win a 20% or 25% Discount");
		System.out.println("Enter 1 to WIN your discount , press 0 to quit");

		try {
			// Variables
			int choice;
			// Read input
			choice = input.nextInt();
			// Conditional
			if (choice == 1) {
				// Random coupon generator
				if (Math.random() < 0.5)
					System.out.println("You've won a 25% OFF coupon!");
				else
					System.out.println("You've won a 20% OFF coupon!");
			} else if (choice == 0)
				System.out.println("Thank you. Goodbye!");

		} catch (InputMismatchException e) {
			System.out.println("Incorrect Entry");
		}

	}

}
