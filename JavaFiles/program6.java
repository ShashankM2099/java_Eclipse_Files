package JavaFiles;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Multiplication table upto ten numbers based on user input.
		// First ask the user for input
		// Store in INT
		//loop and post increment upto 10 numbers
		System.out.println("Enter a INT-variable number: ");
		int user_num = scan.nextInt();
		int i = 0;
		while (i < 10) {
			System.out.println(user_num + "*" + (i + 1) + " = " + (user_num * (i + 1)));
			i++;
			if (i == 10) {
				break;
			}

		}
		scan.close();
		
	}
}
