/*
 * author : [Shashank Mondrati]
 * version @ [ 3/19/2020]
 * Program: This program calculates the GCD of two integers
 */
package LO6;

import java.util.Scanner; // imported scanner

public class modularizingCode { // class name 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main method
		// Creating a scanner
		Scanner input = new Scanner(System.in);

		System.out.println(" ID003");
		System.out.println(" Enter a first integer");// asking user to enter 1st int
		int n1 = input.nextInt();
		System.out.println(" Enter a second integer");// asking user to enter 2nd int
		int n2 = input.nextInt();
		System.out.println(" The Greatest Common divisor for " + n1 + " and " +n2 +" is" + gcd(n1, n2));
	}
// Returning the gcd of two integers
	public static int gcd(int n1, int n2) {
		// TODO Auto-generated method stub
		int gcd = 1; // starting gcd value is 1
		int k = 2; // possibility
		while (k <= n1 && k <= n2) { // while loop
			if (n1 % k == 0 && n2 % k == 0) { // if statement
				gcd = k;
				k++;
			}

		}
		return gcd; // return
	}

}
