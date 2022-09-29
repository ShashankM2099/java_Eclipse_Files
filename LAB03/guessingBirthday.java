/*
 * author: [Shashank Mondrati]
 * version @ [ 2/22/2020]
 * Program: This program guesses the users birthday based on 5 sets of month days.
 */
package LAB03;
import java.util.Scanner; //Imported Scanner
public class guessingBirthday { // class name

	public static void main(String[] args) {
		
		String set1 =	" 1 3 4 5 7 \n" + // Set1 with some numbers
						" 9 11 13 15 \n " + 
						"17 19 21 23 \n " + 
						"25 27 29 31";
		String set2 = 	" 2 3 6 7 \n" +  // Set 2 with some numbers
						" 10 11 14 15 \n" + 
						"18 19 22 23 \n" + 
						"26 27 30 31 \n";
		String set3 = 	" 4 5 6 7 \n" + // set3 with some numbers
						" 12 13 14 15 \n" + 
						"20 21 22 23 \n" + 
						"28 29 30 31 ";
		String set4 = 	" 8 9 10 11 \n" +  // Set4 with some numbers
						" 12 13 14 15 \n" + 
						"24 25 26 27 \n" + 
						"28 29 30 31";
		String set5 = 	" 16 17 18 19 \n" + // Set5 with some numbers
						" 20 21 22 23 \n" + 
						"24 25 26 27 \n" + 
						"28 29 30 31 ";
		int day = 0; // Starting day wth 0
		// Creating a scanner
		Scanner input = new Scanner(System.in); // Scanner variable called input
		// Prompting the user to answer questions
		System.out.println("ID001");
		System.out.println(" IS your birthday in Set1? \n");
		System.out.print(set1);
		System.out.println("\n Enter 0 for No and 1 for Yes");
		int answer = input.nextInt(); // Asking user to enter either 1 or 0
		if (answer == 1) // If Statement
			day += 1;
		// Prompting the user to answer questions
		System.out.println(" \n Is your birthday in Set2?\n");
		System.out.print(set2);
		System.out.println("\n Enter 0 for No and 1 for Yes");
		answer = input.nextInt();
		if (answer == 1) // If Statement
			day += 2;
		// Prompting the user to answer questions
		System.out.println(" \n Is your birthday in Set3?\n");
		System.out.print(set3);
		System.out.println("\n Enter 0 for No and 1 for Yes");
		answer = input.nextInt();
		if (answer == 1) // If Statement
			day += 4;
		// Prompting the user to answer questions

		System.out.println(" \n Is your birthday in Set4?\n");
		System.out.print(set4);
		System.out.println("\n Enter 0 for No and 1 for Yes");
		answer = input.nextInt();
		if (answer == 1)
			day += 8;
		// Prompting the user to answer questions

		System.out.println(" \n Is your birthday in Set5?\n");
		System.out.print(set5);
		System.out.println("\n Enter 0 for No and 1 for Yes");
		answer = input.nextInt();

		if (answer == 1) // If Statement
			day += 16;
		System.out.println(" \nYour birthday is " + day + " !"); // Displaying result

	}

}
