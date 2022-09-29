package lab04;

import java.util.Scanner;

public class firstLastName {
	public static void main(String[] args) {
		Scanner fullName = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String firstName = fullName.nextLine();
		String first = firstName.substring(0, 1).toUpperCase();
		System.out.println("Enter your LastName");
		String lastName = fullName.nextLine();

		String newFirstName = firstName.substring(0, 1).toUpperCase() 
				+ firstName.substring(1, firstName.length());
		
		String newLastName = lastName.substring(0, 1).toUpperCase()+ lastName.substring(1, lastName.length());
		String finalName = newFirstName + " " + newLastName;

		// char lastName = lastN.charAt(0, 1);
		System.out.println("Your name is " + finalName );
		System.out.println("Enter a character within to search for its index");
		char c1 = fullName.next().charAt(0);
		if (finalName.indexOf(c1)>0) {
			System.out.println(finalName.indexOf(c1));
		} System.out.println("Enter a string to see if its in the name or not");
		String s1 = fullName.next();
		if (finalName.contains(s1)) {
			System.out.println("They match");
			System.out.println(finalName.indexOf(s1));
		}
		else {
			System.out.println("They dont match");
		}
	}	
	}

