package LearningJava;

import java.util.*;
import java.io.*;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to search in the array: ");

		String userString = sc.nextLine();
		for (int i = 0; i < userString.length(); i++) {
			String[] searchString = { "My", "Name", "Is", "Rajitha"};
			if (userString.equals(searchString[i])) {
				System.out.println("Your key " + userString + " is at position: " + (i +1 ) + " and index " + i);
		} 
			//	else {
//				System.out.println(userString == searchString[i]);
//				System.out.println("Cant find it");
//				// System.out.println(searchString);
//			}
		}
		sc.close();
	}

}
