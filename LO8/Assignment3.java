package LO8;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Assignment3 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			int selection = searchIndex();
			if ( selection == 5) {
				exit();
				break;
			}
			switch(selection) {
			case 1:
				System.out.println(" Please enter the movie ID you wish to purchase from the list above:");
				int movieID = scan.nextInt(); // for linear search
				break;
			case 2:
				System.out.println("Please enter the movie ID you wish to purchase from the list above: ");
				movieID = scan.nextInt(); // for binary search
				break;
			case 3:
				// for bubble sort
				break;
			case 4: 
				// for selection sort
				break;
			}
			continue;
		}

	}

	public static String exit() {
		System.out.println(" Bye:)");
		return " Bye:)";		
	}

	public static int searchIndex() {
		// TODO Auto-generated method stub

		System.out.println("1.Linear Search" 
				+ "	\n2. Binary Search"
				+ "	\n3.Bubble Sort" 
				 + " \n4. Selection Sort"
				+ "	\n5.Quit");
		int selection = scan.nextInt();
		return selection;
	}

}
