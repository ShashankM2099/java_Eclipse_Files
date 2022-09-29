/*
 * author : [Shashank Mondrati]
 * version @ [2/23/2020]
 * Program: This code asks user to enter a 3 digit number, and the code sees if its a palindrome or not
 */
package helloWorld;

import java.util.Scanner; // imported scanner

public class palindromeNumber { // class name

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // called Scanner variable input
		System.out.println("ID002");
		System.out.println("Enter a palindrome: ");
		int num = input.nextInt(); // asking user to enter their 3 digit num
		double firstDigit = num / 100; // users 1 of 3 digit num divided by 100
		num = num % 10; // and to see % of 10
		if (firstDigit == num) { // if statement and if 1st digit equals third digit
			System.out.println("This was a palindrome"); // If yes.. prints out yes its a palindrome
		} else {
			System.out.println("This is not a palindrome"); // if no..prints out not a palindrome
		}
	}

}
