package javaArrayFiles;

import java.util.Scanner;

public class problemFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] problems = new int[4];
		// user wants to know in every 4 weeks, which week had the highest solving
		// problems

		// using for loop to take user input and store in array
		for (int i = 0; i < 4; i++) {
			problems[i] = sc.nextInt();
			if (problems[i] >= 10) {
				count++;
			}

		}
		System.out.println(count);
		sc.close();

	}
}
