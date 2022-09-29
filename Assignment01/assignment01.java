	/*author @ [Shashank Mondrati]
 * version @ [Feb-03-2020]
 * Description:
 * A Java Program that displays 5 different options with their own functions
 * 
 * Pseudocode for Assignment 01:
 * Imported Scanner and used Scanner input as reference
 * Created Switch Statements and made 5 cases for each option.
 * Provided break for gap between each cases.
 */
package Assignment01;
import java.util.Scanner; // Imported Scanner
public class assignment01 { // Class assignment01
	public static void main(String[] args) { // main method
		Scanner input = new Scanner(System.in); // Created a new scanner variable input
		/*
		 * Pseudocode: Printing the 5 menu options first Used Int variable to Case
		 * numbers
		 */
		System.out.println(" Press 1:  Lab Test Avg Calculator");
		System.out.println(" Press 2 : Go! Dice Roll");
		System.out.println(" Press 3 : Cylinder Volume Calculator");
		System.out.println(" Press 4 : Compute Distance between two points designated by (X1, Y1) and (X2, Y2).");
		System.out.println(" Press 5:  Quit");
		
		int num = input.nextInt(); // asking for the user's menu choice
		switch (num) { // Used a switch statement
		case 1: // case :1
			/*
			 * Pseudocode for Case :1 Test Average Calculator Used a switch statement to
			 * make it easier Imported Scanner and used Scanner input as reference Stored in
			 * double variables to make the average Ask the User for their 3 grades Used
			 * String input for calculate Average Used IF statement for average IF option
			 * chosen by the USER equals A calculates average Average = sum of three
			 * subjects divided by 3. Prints out the avg
			 */
			System.out.println("Thank You for Pressing 1 ");
			System.out.println("What are your Test Grades..so that I can calculate your average");

			System.out.println("Whats your Test 1 Grade?: ");
			double test1 = input.nextDouble(); // Asking user's input for test1 grade
			System.out.println("Whats ur Test 2 grade?: ");
			double test2 = input.nextDouble(); // Asking user's input for test2 grade
			System.out.println("what are your Test 3 Grade:?");
			double test3 = input.nextDouble(); // Asking user's input for test3 grade
			System.out.println("## Press A to find Average,:: ");
			String option = input.next(); // Asking user for input for average
			if (option.equals("A")) {
				double average = (test1 + test2 + test3) / (3); // Average of three test scores
				System.out.println("Your average of three tests are " + average + "%");
				// Displays the print line with the average scores
			} else {
				System.out.println("## Input is incorrect");
			}
			break;
		case 2:
			System.out.println("Thank you for pressing 2");
			System.out.println("Roll the dice");
			int diceOne = (int) (Math.random() * 6) + 1; // Math random integers between 1 and 6
			int diceTwo = (int) (Math.random() * 6) + 1; // Random integers between 1 and 6
			int sum = diceOne + diceTwo; // Sum of both dice rolls
			// calculate if the sum is even or odd
			boolean isOdd = (sum % 2 != 0); // boolean Sum of both rolls doesn't equal zero
			System.out.println("Press 1 if you think sum is odd, press 2 if it is even");
			int decision = input.nextInt(); // Prompting the user for their guess
			// calculate if its is even or odd
			if (decision == 1) { // if statement
				if (isOdd) {
					System.out.println("Victoryy !!");
				} else { // else statement
					System.out.println("Lose..Try Again..Later !!");
				}
			} else if (decision == 2) { // if statement
				if (!isOdd) {
					System.out.println("Victoryy !!");
				} else {
					System.out.println("Lose..Try again..Later !!");
				}
			} else { // else statement
				System.out.println("Input is incorrect");
			}
			break;
		case 3:
			/*
			 * Pseudocode for Case 3: Cylinder Volume Calc Declared and Initialized double
			 * final pi= 3.14. Prompting the user to enter the radius and height of the
			 * cylinder to find the colume Used float for radius and height's input To
			 * calculate the volume the formula was (pi)* (radius squared) times h Used
			 * float volume to make the calcualtion When prompted the for input the code
			 * makes an calculation Prints out the volume of the cylinder with the units
			 */
			final double pi = 3.14; // Declared pi as 3.14
			System.out.println("Thank You for Pressing 3 ");

			System.out.println("Enter Radius and Height to find the Volume of a Cylinder");

			System.out.println("Enter Height of the Cylinder:");

			float height = input.nextFloat(); // Asking user's input for height
			System.out.println("Enter Radius of the Cylinder: ");

			float radius = input.nextFloat(); // Asking user's input for radius

			float volume = (float) ((pi) * (radius * radius) * (height)); // Finding Volume
			System.out.println("Your Volume of the Cylinder is : " + volume + " cm cubed");
			break;

		case 4:
			/*
			 * Pseudocode for Case 4: Distance between 2 points Prompting the user for X1,
			 * X2 and Y1, Y2 Values To calculate the distance between those 2 points used
			 * the formula A = (x2-x1) squared added (y2-y1) squared and complete squared
			 * Used Math.pow And printed the answer
			 */

			System.out.println("Thank You for Pressing 4 ");

			System.out.println("Enter your values so I can compute the distance b/w them");

			System.out.println("Enter your X1 Value");

			double X1 = input.nextDouble(); // Asking user's input for X1

			System.out.println("Enter your X2 Value");

			double X2 = input.nextDouble(); // Asking user's input for X2

			System.out.println("Enter your Y1 Value");

			double Y1 = input.nextDouble(); // Asking user's input for Y1

			System.out.println("Enter your Y2 Value");

			double Y2 = input.nextDouble(); // Asking user's input for Y2

			double a = Math.pow((Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)), 1 / 2);
			// Finding distance between two points

			System.out.println("Your distance between two points is: " + a);
			break;

		case 5:
			/*
			 * Pseudocode for case 5 : Exit When chosen option 5. Prints out Exit message
			 */
			System.out.println("GoodBye..Thanks for Having us :)");

			break;
		default:
		}

	}
}
