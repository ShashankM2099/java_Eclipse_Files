/*author : [Shashank Mondrati]
 * version @ [ 4/13/2020]
 * Program : Activity 8.2
 */
/*
 * Part A: Ask the user to keep entering words as long as the user wants, until they write stop. Record the user input
 *  as a string by appending them to current variable. ##############
 *  PArt B: Once the user enters stop, should display the menu ################
 *  1. Display the # of words
 *  2. # of letters
 *  3. Display all words entered by user
 *  4. # of times 's' occurs
 *  5. # of words s occurs
 *  6. All to u.Case
 *  7. All to l.Case
 *  8. Display if certain word was entered by the user
 *  9. Replace
 *  10. Exit.
 */
package LAB03;

import java.util.Scanner;

public class labTestTwo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = "";
		System.out.print("Sorcerer Supreme orders you to enter some strings :");
		while (true) {
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("stop"))
				break;
			s += input + " not ";
		}
		if (s.length() >= 5)
			s = s.substring(0, s.length() - 5);
		while (true) {
			int option = searchIndex();
			if (option == 10) {
				exit();
				break;
			}
			switch (option) {
			case 1:
				numberOfWords(s); // ## of words
				break;

			case 2:
				countLetters(s); // ## of letters
				break;
			case 3:
				System.out.println("Your String is" + s);
				break;
			case 4:
				System.out.println(" ENter a string for its ## of occurences");
				String s2 = sc.next();
				int wordOccured = wordOccured(s, s2);
				System.out.println(" Your Word Occured " + wordOccured + " times");
				break;

			case 5:

				break;
			case 6:
				String upperCase = s.toUpperCase();
				System.out.println(" Your uppercased String is: " + upperCase);
				break;
			case 7:
				String lowCase = s.toLowerCase();
				System.out.println(" Your lowerCase String is: " + lowCase);
			case 8:
				System.out.println(" Enter a word to see if its in string");
				String checkSent = sc.next();
				matchSent(s, checkSent);
				break;
			case 9:
				System.out.println(" ENter a string to replace");
				String search = sc.next();
				System.out.println(" Enter a word you'd like to replace with");
				String replace = sc.next();
				replaceWord(s, replace, search);
				break;

			}

		}
	}

	public static int wordOccured(String s, String s2) {
		int sum = 0; // starting with 0

		for (int i = 0; i < s.length(); i++) { // for loop

			char charAtI = s.charAt(i);

			if (charAtI == s2.charAt(0)) // if statement
				sum++;
		}
		return sum;
	}

	public static String replaceWord(String s, String replace, String search) {
		// TODO Auto-generated method stub
		String replaceWord = s.replace(search, replace);
		System.out.println(" Your string is" + replaceWord);
		return replaceWord;
	}

	public static void matchSent(String s, String checkSent) {

		System.out.println(s.contains(checkSent));

	}

	public static int countLetters(String s) { // counting letters method in a string
		// TODO Auto-generated method stub
		int countLetters = 0;

		// Counts each character except space
		for (int i = 0; i < s.length(); i++) { // for loop
			if (s.charAt(i) != ' ') // if statement
				countLetters++;
		}

		System.out.println(" Total ## of letters in the String: " + countLetters);
		return countLetters;

	}

	public static int numberOfWords(String s) {
		int countWords = 0;
		if (!(" ".equals(s.substring(0, 1))) || !(" ".equals(s.substring(s.length() - 1)))) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') {
					countWords++;
				}
			}
			countWords = countWords + 1;
		}
		System.out.println(" Number of words in the string are:  " + countWords); // returns as a 0 if string starts or
																					// ends with space " ".
		return countWords;

		// TODO Auto-generated method stub

	}

	public static String exit() {
		System.out.println(" Sayonara, Doctor Strange leaves you ");
		return " Sayonara, Doctor Strange leaves you";
		// TODO Auto-generated method stub

	}

	public static int searchIndex() { // main menu index method
		System.out.println(" \t Sorcerer Supreme's List " + "\n 1. Display the number of words "
				+ " \n 2. Display ## of Letters" + "" + "\n 3.Display all the words entered by the user. "
				+ " \n 4.Display the number of times letters 's' occurs"
				+ " \n 5.Display the ## of words letter 's' occurs" + "" + " \n 6.Display all words to UpperCase"
				+ " \n7. Display all words to LowerCase" + " \n8.Display if certain word has been entered by user. "
				+ " \n 9. Replace certain word. " + " \n 10. Exit ");
		int choice = sc.nextInt();
		return choice;
	}

}
