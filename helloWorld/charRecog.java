package helloWorld;

import java.util.Scanner;

public class charRecog {
	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);
		System.out.println("Enter your 5-word sentence :");
		String sentence = word.nextLine();
		System.out.println(sentence);
		int firstSpace = sentence.indexOf(" ", 0);
		int secSpace = sentence.indexOf(" ", firstSpace + 1);
		System.out.println(sentence.charAt(0) + " " + sentence.charAt(firstSpace - 1));
		int thirdSpace = sentence.indexOf(" ", secSpace + 1);
		System.out.println(sentence.charAt(firstSpace + 1) + " " + sentence.charAt(secSpace - 1));
		int fourSp = sentence.indexOf(" ", thirdSpace + 1);
		System.out.println(sentence.charAt(secSpace + 1) + " " + sentence.charAt(thirdSpace - 1));
		int fifSp = sentence.indexOf(" ", fourSp + 1);
		System.out.println(sentence.charAt(thirdSpace + 1) + " " + sentence.charAt(fourSp - 1));
		int lastSp = sentence.indexOf(" ", fourSp + 1);
		System.out.println(sentence.charAt(fourSp + 1) + " " + sentence.charAt(sentence.length() - 1));

	}
}
