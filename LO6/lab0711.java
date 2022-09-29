package LO6;

import java.util.*;

public class lab0711 {

	public static void main1(String[] args) {
	}

	// TODO Auto-generated method stub
	static String showingMenu() {
		String message = "1. Add odd numbers from a to b\r\n" + "\r\n" + "2. Add even numbers from a to b\r\n" + "\r\n"
				+ "3. Show multiples of c from a to b\r\n" + "\r\n" + "4. Exit";
		return message;
	}

	static int oddTotal(int a, int b) {
		int total = 0;
		for (int i = a; i < b; i++) {
			if (!(i % 2 == 0)) {
				total += i;
			}
		}
		return total;
	}

	static int evenTotal(int a, int b) {
		int total = 0;
		for (int i = a; i < b; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		return total;
	}

	static int multipleC(int a, int b, int c) {
		int multipleNum = 0;
		for (int i = a; i < b; i++) {
			if (i % c == 0) {
				multipleNum = i;
				i++;
			}
		}
		return multipleNum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(showingMenu());
		System.out.println("Choose an option from the menu: ");
		int choice = input.nextInt();

		while (!((choice == 1) || (choice == 2) || (choice == 3))) {
			System.out.println(showingMenu());
			System.out.println("Choose an option from the menu: ");
			choice = input.nextInt();
		}
		if (choice == 1) {
			System.out.println("Enter a starting number: ");
			int numStart = input.nextInt();
			System.out.println("Enter the last number: ");
			int numLast = input.nextInt();

			System.out.println("The total of odd numbers from " + numStart + " to " + numLast + " is "
					+ oddTotal(numStart, numLast));
			System.out.println(showingMenu());
			System.out.println("Choose an option from the menu: ");
			choice = input.nextInt();
		} else if (choice == 2) {
			System.out.println("Enter a starting number: ");
			int numStart = input.nextInt();
			System.out.println("Enter the last number: ");
			int numLast = input.nextInt();

			System.out.println(
					" The total even numbers " + numStart + " to " + numLast + " is " + evenTotal(numStart, numLast));
			System.out.println(showingMenu());
			System.out.println("Choose an option from the menu: ");
			choice = input.nextInt();
		} else if (choice == 3) {
			System.out.println("Enter a starting number: ");
			int numStart = input.nextInt();
			System.out.println("Enter the last number: ");
			int numLast = input.nextInt();
			System.out.println("Enter a number to find the multiple: ");
			int MultipleNum = input.nextInt();

			System.out.println("The multiples of " + MultipleNum + " from " + numStart + " to " + numLast + " are "
					+ multipleC(numStart, numLast, MultipleNum));
			System.out.println(showingMenu());
			System.out.println("Choose an option from the menu: ");
			choice = input.nextInt();
		}

		else if (choice == 4) {
			System.out.println("Thanks for coming...Do not Forget to Wash your Hands!!");
		}
	}
}