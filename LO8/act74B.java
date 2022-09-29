/*
 * author: [Shashank Mondrati]
 * version @ [4/5/2020]
 * Program : Allows the user to create accounts.
 *  For each new account, ask the user to enter a username and password separately.
 *   Saves the account information to a text file, called "accounts.txt". 
 *   When adding to the text file, each account will be on a separate line with a space between username and password. 
 *   After each account has been entered, the user should be asked whether or not they want to enter another one. 
 *   If the user chooses to quit,then the program displays  "Goodbye."
 */
package LO8;

import java.io.File; // imported file
import java.io.FileNotFoundException; // imported file not found exception
import java.io.PrintWriter; // imported print writer
import java.util.ArrayList; // imported array list
import java.util.Scanner; // imported scanner

public class act74B {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// Part1
		Scanner input = new Scanner(System.in);
		File file = new File("accounts.txt"); // new file
		PrintWriter fileOutput = new PrintWriter(file); // new writing at file
		while (true) {
			System.out.println(" Enter your userName"); // user enters their uName
			String userName = input.next();
			System.out.println(" Enter your passWord"); // user enters theie pWord
			String passWord = input.next();
			fileOutput.write(userName + " " + passWord); // added both seperated by a space
			fileOutput.append("\n");
			System.out.println("## Press 1 to add new one, press 2 to exit the program"); // users choice
			int option = input.nextInt();
			if (option == 1) { // if statement
				continue;
			}
			if (option == 2) { // if statement
				System.out.println("Good bye");
				break;
			}
		}
		fileOutput.close(); // closing fileOutput
		// Part2
		/*
		 * Reads in the account information from "accounts.txt". Creates two ArrayLists
		 * - one for the usernames and one for the passwords. For each line read in from
		 * the text file, adds the username and password into their respective
		 * ArrayLists. The index value should always match. For example, the first
		 * account should have the username at index of 0 in one ArrayList, and the
		 * password at index of 0 in the second ArrayList. The second account should
		 * have username at index 1 and password at index 1. Once all of the information
		 * from "accounts.txt" has been successfully added to the ArrayLists, Next, ask
		 * the user to login by entering a username. Check to see if that username is in
		 * the corresponding ArrayList. If so, ask the user to enter a password and
		 * check to see if they entered the correct password. If the user logged in
		 * successfully, simply display "Success!".
		 */
		ArrayList<String> usernames = new ArrayList<>(); // array list for usernames
		ArrayList<String> passwords = new ArrayList<>(); // array list for passwords
		File filereader = new java.io.File("accounts.txt"); // new file location
		Scanner fileInput = new Scanner(filereader);
		while (fileInput.hasNext()) { // while loop
			String userName = fileInput.next();
			String password = fileInput.next();
			// String[] accountDetailsArray = accountDetails.split(" ");
			usernames.add(userName);
			passwords.add(password);
		}
		fileInput.close(); // closing file input
		System.out.println("Enter your userName");
		String userName = input.next();
		if (usernames.contains(userName)) { // if statement for user enters their userName
			System.out.println(" Success");
		} else {
			System.out.println(" Account doesn't exist");
		}
	}

}
