/*
 * author :Shashank Mondrati
 * version : 2/12/2020
 * Program: Checking fractions and displaying mixed fractions.
 */
package Assignment01;

import java.util.Scanner;

public class Act309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your numerator");
		int num = input.nextInt();
		System.out.println("Enter your denominator");
		int denom = input.nextInt();
		int result = num / denom;
		int result2 = num % denom;
		if (denom > num) {
			System.out.println("you've a proper fraction: " + (num + " / " + denom));
		}  if (num > denom) {
			result = num / denom;
			result2 = num % denom;
			System.out.println("Yoou have a improper fraction:" + num + "/" + denom);
			System.out.println("You have an improper fraction the mixed number is: " + result + " " + (result2 +"/" + denom));
		}
		input.close();

	}
}
