package LAB03;

import java.util.Scanner;

public class Act05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your a value: ");
		double a, b;
		a = input.nextInt();
		System.out.println("Enter your b value:");
		b = input.nextInt();
		double c = a / b;

		if (b == 0) {
			System.out.println("Cannot divide by zero be you get " + c);
		} else {
			c = a / b;
			System.out.println("The division is : " + c);

		}

//			if (b==0){
//				System.out.println("the program works");
//			}
//			else {
//			
	}
}
