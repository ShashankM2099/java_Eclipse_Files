package LO5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Act02 {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter a num");
	
		int num=userinput.nextInt();
		while(num<0 || (!(num%10==0))) {
			
			System.out.println("Enter a number:");
			num=userinput.nextInt();
			
		}
		
		System.out.println("You made a wise choice");
		

//		System.out.println("Enter a positive integer");
//		int num=userinput.nextInt();
//		while (num < 0) {
//			System.out.println("Number should be an +ve integer");
//			num=userinput.nextInt();
//			if ((num > 0) && (num % 10 == 0)) {
//
//				System.out.println("Your num is : " + num);
//			} else {
//				System.out.println("Num shud be a postive integer");
//				num = checkNum();
//			}

		}

	

//	public static  void checkNum() {
//		System.out.print("Please Enter Your Positive number :");
//	
//		while(num<0 || num%10==0) {
//			System.out.print("Please Enter Your Positive number :");
//			 num=userinput.nextInt();
//
//		
//	}
//		System.out.println("WIse choice");
}

