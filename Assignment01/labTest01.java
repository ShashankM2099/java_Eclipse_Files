/*
 * Program Name : Fortune Teller
 * 
 * @ author name : [Shashank Mondrati]
 * @ version Date " [ 2/18/2020 ]
 * Lab Section : ITSC1212-003
 * 
 * Purpose: This program asks user for their first, last names and their DOB's and Year of birth, by getting these information 
 * from the user this program is able to calculate their Zodiac sign, their lucky and magic numbers respectively.
 */
package Assignment01;

import java.util.Scanner; // imported Scanner
import java.util.Random; // imported Random

public class labTest01 { // class labTest01

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name? ");

		String firstN = input.nextLine(); // asking for first Name

		System.out.println("What is your last name? ");

		String lastN = input.nextLine(); // asking last Name

		System.out.println("What year were you born? ( Enter last 4 digits of your year)");

		int yearB = input.nextInt(); // asking year born

		System.out.println("What month were you born (enter 1-12) ?");

		int monthB = input.nextInt(); // asking month born

		System.out.println("What day of the month were you born (enter 1-31) ? ");

		int monthD = input.nextInt(); // asking month of the day born like 7 month

		// Printing Menu with the users name

		System.out.println("Soo " + firstN + " " + lastN + " here is the menu so you can know your Fortune");

		System.out.println("Press 1 for your Lucky Number.");

		System.out.println("Press 2 for your Magic Number.");

		System.out.println("Press 3 for Horoscope.");

		int choice = input.nextInt(); // choice for the user for what they wish to know about.

		String sign = null; // using for zodiac sign

		switch (choice) { // Switch statement

		case 1: // Case 1 for Lucky Number

			System.out.println(" I see you've chosen to do the Lucky Number.. " + firstN);

			int numGenerated = (int) (Math.random() * 8 + 1); // random numbers between 1 and 8

			System.out.println(" The lucky number is " + numGenerated);

			if (numGenerated > 3 && numGenerated < 8) { // random greater than 3 but less than 8

				System.out.println("Congrats " + firstN + " you are a very lucky person.");
			} else if (numGenerated == 8 || numGenerated == 2) { // if random equals 8 or 2

				System.out.println(firstN + " you are extremely unlucky");
			} else if (numGenerated == 1 || numGenerated == 3) {// if random equals 1 or 3

				System.out.println(firstN + " you are just barely lucky");
			}

			break;

		case 2: // Case 2 for Magic Number

			System.out.println("Soo you've chosen to do the Magic Number I see  " + firstN);

			final int MAGIC_RANGE = 110; // range of Magic

			int magicN = (int) ((yearB * monthB) % MAGIC_RANGE); // calculation

			System.out.println(firstN + " " + lastN + " you're lucky number is  " + magicN); // printing the magicNumber
																								// of
																								// user
			break;

		case 3: // Case 3 for Horoscope

			System.out.println(" All right now..You wish to see your horoscope is it  " + firstN + " ?");

			if (monthB == 1) { // if month equals 1

				if (monthD <= 19) // if day of the month is less than or equal to 19

					sign = " You are a Capricorn you can do it."; // Zodiac Sign according to Calendar

				else {

					sign = " Aquarius..huh..smart you little flirt.";
				}

			} else if (monthB == 2) { // if month equals 2

				if (monthD <= 18) // if day of the month is less than or equal to 18

					sign = " Congrats you're a Aquarius. "; // Zodiac Sign according to Calendar

				else {

					sign = " Pisces swimming in the water freely and emotional.";
				}

			} else if (monthB == 3) { // if month equals 3

				if (monthD <= 18) // if day of the month is less than or equal to 18

					sign = "  You're a Pisces.. smart, emotional, intelligent."; // Zodiac Sign according to Calendar
				else {
					sign = " Aries.  ";
				}
			} else if (monthB == 4) { // if month equals 4

				if (monthD <= 19) // if day of the month is less than or equal to 19

					sign = " Ooh your'e a Aries nice you'll meet someone amazing. "; // Zodiac Sign according to
																						// Calendar
				else {

					sign = " Taurus...go Bulls!";
				}

			} else if (monthB == 5) { // if month equals 5

				if (monthD <= 20) // if day of the month is less than or equal to 20

					sign = " Taurus...go Bulls!"; // Zodiac Sign according to Calendar

				else {

					sign = " Gooo Will SMith Gemini Man";
				}

			} else if (monthB == 6) { // if month equals 6

				if (monthD <= 20) // if day of the month is less than or equal to 20

					sign = " Gooo Will SMith Gemini Man"; // Zodiac Sign according to Calendar

				else {

					sign = " Youre a nice Guy and youre sign is Cancer";
				}
			} else if (monthB == 7) { // if month equals 7

				if (monthD <= 22) // if day of the month is less than or equal to 22

					sign = " Youre a nice Guy and youre sign is Cancer"; // Zodiac Sign according to Calendar

				else {

					sign = " Leo? Like Leo Leo? ";
				}

			} else if (monthB == 8) { // if month equals 8

				if (monthD <= 22) // if day of the month is less than or equal to 22

					sign = " You're a Leo ..now Roar like a Leo"; // Zodiac Sign according to Calendar

				else {

					sign = " You're a balanced Virgo from the show Beyblade";
				}

			} else if (monthB == 9) { // if month equals 9

				if (monthD <= 22) // if day of the month is less than or equal to 22

					sign = " You're a balanced Virgo from the show Beyblade"; // Zodiac Sign according to Calendar

				else {

					sign = " A libra..huh..balanced I see";
				}
			} else if (monthB == 10) { // if month equals 10

				if (monthD <= 22) // if day of the month is less than or equal to 22

					sign = " A libra..huh..balanced I see"; // Zodiac Sign according to Calendar

				else {

					sign = " A desert Scorpio";
				}
			} else if (monthB == 11) { // if month equals 11

				if (monthD <= 21) // if day of the month is less than or equal to 21

					sign = " A desert Scorpio "; // Zodiac Sign according to Calendar

				else {

					sign = " A sagittarius ride like wind bullseye";
				}
			} else if (monthB == 12) { // if month equals 12

				if (monthD <= 21) // if day of the month is less than or equal to 21

					sign = " A sagittarius ride like wind bullseye"; // Zodiac Sign according to Calendar

				else {

					sign = "Back to Capricorn aren't you";
				}
			}
		default:

			System.out.println("Congrats " + firstN + " " + lastN + sign); // printing the users name with their zodiac
																			// sign
		}

	}
}
