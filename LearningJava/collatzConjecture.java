package LearningJava;

import java.util.*;

public class collatzConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a int-based number: ");
		int num = sc.nextInt();
		int userNum = num;
		
		int steps = 0, highVal = 0;
		while (true) {
			// if num is even divide by 2, and increase step by 1
			if (userNum % 2 == 0) {
				userNum /= 2;
				steps += 1;
				if (userNum > highVal) {
					highVal = userNum;
				}
			}
			if (userNum % 2 != 0 && userNum != 1) {
				userNum = (3 * userNum) + 1;
				steps += 1;
				if (userNum > highVal) {
					highVal = userNum;
				}

			}
			if (userNum == 1) {
				System.out.printf("Original Number, %d", num);
				System.out.printf("\nFinal Number %d", userNum);
				System.out.println("\nSteps it took are: " + steps);
				System.out.println(String.format("Highvalue is: %d", highVal));
				break;

			}

		}
		sc.close();
	}

}
