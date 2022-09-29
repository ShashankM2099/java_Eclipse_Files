/*
 * author : [Shashank Mondrati]
 * version @ [ 3/19/2020]
 * Program: This Program replaces a word with the user chosen word, and prints out.
 */
package LAB03;

import java.util.Scanner; // imported scanner

public class wordReplace { // class name

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // scanner
		System.out.println("ID003"); // ID003
		System.out.println("Enter a string: "); // User enters a string
		String s1 = sc.nextLine();
		int len = s1.length() - 1;

		System.out.println("Enter a word you'd like to replace: "); // Word 1
		String w1 = sc.next();
		System.out.println("Enter another word you'd like to replace with: " + w1); // Word to be
																					// replaced with
		String w2 = sc.next();

		System.out.println(" Part I \nNew String: " + replacedString(w1, s1, len, w2)); // replaced word string
		System.out.println(" Part II  \nNew String: " + replacedString(w1, s1, len, w2));

	}

	public static String replacedString(String w1, String s1, int len, String w2) { // replacedString method
		if (s1.contains(w1)) { // if statement
			// Part 1
		} else {
			System.out.println(" Could not find the word");
		} 
		// Part II using loops
		for (int i = 0; i < len; i++) { // for loop
			if (s1.contains(w1)) { // if statement
				w1.equals(w2);
				break; // break tag
			} else {
				System.out.println(" Could not find the word");
			}
		}
		String replaceStrings = s1.replace(w1, w2);
		return replaceStrings; // return type

	}

}
