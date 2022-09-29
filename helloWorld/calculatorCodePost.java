/*
 * author: [Shashank Mondrati]
 * version @[ 3/25/2020] 
 * Program: This program asks user to enter two numbers for addition and division, and stop looping when 
 * the user enters a certain number
 */
package helloWorld;

import java.util.Scanner; // imported scanner

public class calculatorCodePost { // class name

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // called scanner scan
		showMenu(); // method call back
		int choice = scan.nextInt(); // user choice
		Boolean showMenu = false; // boolean = false
		while (choice != 3) { // while loop
			if (showMenu) { // if statement
				showMenu();
				int choice1 = scan.nextInt();
				choice = choice1;
				if (choice == 3) { // if statement
					break; // break tag
				}
			}
			showMenu = true;
			System.out.println(" Enter a number");
			double num1 = scan.nextDouble();
			System.out.println(" Enter another number");
			double num2 = scan.nextDouble();
			switch (choice) { // switch statement
			case 1:
				System.out.println(" Addition is " + add(num1, num2)); // addition
				break; // break tag
			case 2:
				System.out.println(" Division is " + division(num1, num2)); // division
				break; // break tag
			case 3:
				exitMessage(); // displays an exit message
				break;
			}
		}
		exitMessage();
	}

	private static void exitMessage() { // method exit text
		System.out.println(" Thanks for coming.. DO not forget to wash your Hands");
		// TODO Auto-generated method stub

	}

	private static double division(double num1, double num2) { // method division
		// TODO Auto-generated method stub
		double division = (double) (num1 / num2);
		return division; // return
	}

	private static double add(double num1, double num2) { // addition method
		// TODO Auto-generated method stub
		double add = (double) (num1 + num2);
		return add; // return
	}

	private static void showMenu() { // method shows menu
		// TODO Auto-generated method stub
		System.out.println(" Welcome to Calc \n 1. Addition \n 2. Division \n 3. Exit");

	}

}
