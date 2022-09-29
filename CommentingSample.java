import java.util.Scanner; //This line imports the Scanner class from library which allows you to use Scanner in this class

/**
 * This program is supposed to give a better understanding about the Lab 2. This
 * program shows a sample program on how to calculate the area of a circle. This
 * part of the code is called Block Comments also known as JavaDoc Comments. It
 * is a necessary and must part of the code because it helps others to
 * understand your code.
 * 
 * @author Devansh Desai
 * @version 1.0.1
 * @date 8/1/2016
 */
public class CommentingSample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter your string: ");
		String userString = sc.nextLine();
		System.out.println(" Your string length is: " + userString.length());
		System.out.println("TO find the index of your entered char \n Enter a char to find the slot: ");
		char userChar = sc.next().charAt(0);
		if (userString.indexOf(userChar) > 0) {
			System.out.println(" your Index of " + userChar + " is at " + userString.indexOf(userChar));

		}

		System.out.println("Find out how many letters are in your string: ");
		int countLetters = 0;
		try {
			for (int i = 0; i < userString.length(); i++) {

				if ((userString.charAt(i) != ' ')) {
					countLetters++;

				}

			}
			System.out.println(" your letters are " + countLetters);

		} catch (IndexOutOfBoundsException ex) {
			System.out.println("IndexOutOfException");
			ex.printStackTrace();

		}

	}
}
