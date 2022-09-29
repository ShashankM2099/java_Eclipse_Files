/*
 * author : [Shashank Mondrati]
 * version @ [3/15/2020]
 * Program : This program displays if the number is prime or not, then the users a max number, 
 * and the programs displays to the max numbers if the numbers are prime or not.
 */
package LO5;

import java.util.Scanner; // imported scanner

public class primeNumber { // class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.println("ID001"); // ID001
		System.out.println("Enter a number"); // USer enters their number
		int n1 = number.nextInt();
		boolean flag = false; // boolean
		for (int i = 2; i <= n1 / 2; ++i) { // conditions for prime number
			// condition for nonprime number
			if (n1 % i == 0) { // if statement
				flag = true;
				break; // break statement
			}
		}

		if (!flag) // if statement
			System.out.println(n1 + " is a prime number.");
		else
			System.out.println(n1 + " is not a prime number.");
		System.out.println("Enter a max number: "); // USer enters their max number
		int max = number.nextInt();

		for (int y = 0; y < max; ++y) { // conditions
			int i = 2;
			if (y % i == 0) {
				if (!flag)

					System.out.println(y + " is a prime number");
			} else
				System.out.println(y + " is not a prime number");

		}

	}
}
