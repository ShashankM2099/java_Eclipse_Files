/*
 * author [ Shashank Mondrati]
 * version @ [ 3/17/2020]
 * Program : This program calculates how many words are the sentence entered by the user.
 */
package LAB03;

import java.util.Scanner; // imported scanner

public class countWords { // class name

	public static void main(String[] args) { // main method
		Scanner in = new Scanner(System.in); // scanner name in
		// TODO Auto-generated method stub
		System.out.println("ID001"); // iD001
		System.out.println("ENter your string");
		String str = in.nextLine();
		System.out.println("Number of words : " + count_Words(str) + " \n"); // OUtput line
	}

	public static String count_Words(String str) { // String method
		int count = 0; // starting count with 0
		if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {// if statement
			for (int i = 0; i < str.length(); i++) { // for loop
				if (str.charAt(i) == ' ') { // if statement
					count++;
				}
			}
			count+=1;
		}

		return String.valueOf(count); // return type
	}
}
