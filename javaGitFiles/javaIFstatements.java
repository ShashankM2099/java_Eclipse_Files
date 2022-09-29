package javaGitFiles;

//import java.util.Scanner;

public class javaIFstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if statements

		// need steps for this 1 21 321 4321 54321
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		/*
		 * Need coding and answers 
		 * 5 
		 * 4 4 
		 * 3 3 3
		 * 2 2 2 2
		 * 1 1 1 1 1
		 */
		// use forLopp.java for this
		System.out.println("------------------");
		for (int i = 5; i >= 1; i--) { // outer loop runs 5 time
			for (int j = 5; j >= i; j--) { // inner loop prints i rows with the same num
				System.out.print(i+ "");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter two numbers");
//		int userNum1 = sc.nextInt();
//		int userNum2 = sc.nextInt();
//		if (userNum1 > userNum2) {
//			System.out.println("First is greater: " + userNum1);
//		} else {
//			System.out.println("Second is greater: " + userNum2);
//		}
//
//		System.out.println("Enter your grade to see if you passed or not: ");
//		int grade = sc.nextInt();
//		System.out.print("Grade: ");
//
//		if (grade < 25) {
//			System.out.println("F");
//		}
//		if (grade >= 25 && grade <= 45) {
//			System.out.println("E");
//		}
//		if (grade >= 45 && grade <= 50) {
//			System.out.println("D");
//		}
//		if (grade >= 50 && grade <= 60) {
//			System.out.println("C");
//		}
//		if (grade >= 60 && grade <= 80) {
//			System.out.println("B");
//		}
//		if (grade >= 80) {
//			System.out.println("A");
//		}
//		sc.close();

	}

}
