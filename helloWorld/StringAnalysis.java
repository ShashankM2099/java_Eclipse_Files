/*
 * author: [Shashank Mondrati]
 * version @[3/6/2020]
 * Program : Allow the user to enter a String of any length. 
 * Next, the user will then enter a letter. Next, the user will then enter a index number.  
 * This program will test the following:
What is the String length?
What is the index of the letter?
What letter is at the index number?

 */
package helloWorld;

import java.util.Scanner;

public class StringAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your String:");
		String s1 = input.nextLine(); // Prompting the user for their String
		System.out.println("Your string length is: " + s1.length()); // string legnth
		System.out.println("Enter a character"); // Enter a character from string
		char c1 = input.next().charAt(0); // Char at since
		if (s1.indexOf(c1) > 0) { // if statement
			System.out.println("The Slot Number of " + c1 + " " + s1.indexOf(c1)); // displays index
		}
		System.out.println("Enter a number "); // prompting the user
		int n1 = input.nextInt();
		if (n1 >= 0 && n1 < s1.length() - 1) {
			System.out.println("The Letter " + n1 + " " + " is at " + s1.charAt(n1)); // displays the char at users
																						// prompt
		}
	}

}
