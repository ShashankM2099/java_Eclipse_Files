package dayEx2;

import java.util.*;

public class palindromeSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString, reverseString = ""; // a blank spacer
		Scanner sc = new Scanner(System.in);// scanner
		System.out.println("Enter the string: ");
		originalString = sc.nextLine(); // getting input
		int lengthString = originalString.length()-1; // length of the user input
		for (int i = lengthString; i >= 0; i--) { // for loop, for i = length-1, while i>=0 and post decrement
			reverseString += originalString.charAt(i);

		}
		if (originalString.equals(reverseString)) {
			System.out.println("Palindromical String");

		} else
			System.out.println("Not a Palindromical String");
		sc.close();
	}

}
