package LearningJava;

import java.util.*;
import java.io.*;

public class maxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User entering num of elems in their array
		// finding the max num of their entered array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in your array");
		int userEnter = sc.nextInt();
		int[] userA = new int[userEnter];
		int largest = userA[0];

		for (int i = 0; i < userA.length; i++) {
			System.out.println("Enter the " + i + "th element: ");
			userA[i] = sc.nextInt();
			if (userA[i] > largest) {
				largest = userA[i];
			}

		}

		System.out.print("Largest is: " + largest);
		sc.close();
	}

}
