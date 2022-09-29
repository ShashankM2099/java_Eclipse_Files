/*
 * author: [Shashank Mondrati]
 * version @[ 3/25/2020] 
 * Program: This program asks user to enter two numbers for addition and division, and stop looping when 
 * the user enters a certain number
 */
package helloWorld;

import java.util.Scanner; // imported scanner

public class Calculator { // class name

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // called scanner scan
		Boolean status= true;
		while (status) { // while loop
			showMenu(); // method call back
			String choice = scan.next(); // user choice
			switch (choice) { // switch statement
			case "A":{
				int num1 = getFirstNumber(scan);
				int num2 = getSecondNumber(scan);
				 add((int) num1, num2); // addition
				break; // break tag
			}
			case "B":{
				int num1 = getFirstNumber(scan);
				int num2 = getSecondNumber(scan);
				 division(num1, num2); // division
				break; // break tag
			}
			case "C":
				exit(); // displays an exit message
				status=false;
				break;
			}
		}
	}

	private static int getSecondNumber(Scanner scan) {
		System.out.println(" Enter another number");
		int num2 = scan.nextInt();
		return num2;
	}

	private static int getFirstNumber(Scanner scan) {
		System.out.println(" Enter a number");
		int num1 = scan.nextInt();
		return num1;
	}

	public static void exit() { // method exit text
		System.out.println(" Thanks for coming.. DO not forget to wash your Hands");
		// TODO Auto-generated method stub

	}

	public static  void division(int num1, int num2) { // method division
		// TODO Auto-generated method stub
		int division = (int) (num1 / num2);
		System.out.println(" Division is " + division); // return
	}

	public static  void add(int num1, int num2) { // addition method
		// TODO Auto-generated method stub
		int add = (int) (num1 + num2);
		System.out.println(" Addition is " + add); // addition

	}

	public static void showMenu() { // method shows menu
		// TODO Auto-generated method stub
		System.out.println(" A. Addition \n B. Division \n C. Exit");

	}

}
