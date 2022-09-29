package dayEx1;

import java.util.*;

public class factorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Write a factorial number based on user input
		// Facto works on exclaimation
		// for example 3! = 3*2*1==6
		System.out.println("Enter the number you want factorial for: ");
		int userEn = sc.nextInt();

		System.out.println("Factor for number " + userEn + " is: " + factorialMethod(userEn));
		sc.close();

	}

	public static long factorialMethod(int n) {
		// TODO Auto-generated method stub
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
