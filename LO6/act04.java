package LO6;

import java.util.Scanner;

public class act04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many string do you wish to enter");
		Integer input = Integer.valueOf((in.next()));
		System.out.println("Enter your numbers :");
		String[] listOfNum = new String[input];
		for (int i = 0; i < listOfNum.length; i++) {
			listOfNum[i] = in.next();
			in.nextLine();
			// in.nextLine();
		}
		int sum = 0;
		for (int i = 0; i < listOfNum.length; i++) {
			sum = sum + Integer.valueOf(listOfNum[i]);
		}
		System.out.println("Sum " + sum);
	}
}
