package helloWorld;

import java.util.Scanner;

public class countWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a string: ");
		String sentence = scan.nextLine();
		countWords(sentence);
		System.out.println(" Number of words are " + countWords(sentence));
	}

	public static int countWords(String sentence) {
		int countWords = 0;
		if (!(" ".equals(sentence.substring(0, 1))) || !(" ".equals(sentence.substring(sentence.length() - 1)))) {
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i) == ' ') {
					countWords++;
				}
			}
			countWords = countWords + 1;
		}
		return countWords;
	}
}
