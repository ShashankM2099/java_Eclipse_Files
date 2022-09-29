package dayEx1;

import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: "); // USer enters their number
		long n1 = sc.nextLong();
		int i;
		boolean flag = false; // boolean
		for (i=2; i <= n1 / 2; i++) { // conditions for prime number
			// condition for nonprime number
			if (n1 % i == 0) { // if statement when n1 mod i == 0
				flag = true;
				break;// break statement
			}
		}

		if (!flag) // if statement
			System.out.println(n1 + " is a prime number, divisible by 1 and itself.");
		else
			System.out.println(n1 + " is not a prime number, divisible by 1," + i + " and itself.");
		sc.close();
	}

}
