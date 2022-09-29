/* author : [Shashank Mondrati]
 * version @ [ 2/23/2020]
 * Program: 
 * This program asks user to enter their month and day they were born and the program gives their zodiac sign
 * After the program ends..generates a random month and day generating a zodiac sign with the random month and day.
 */
package helloWorld;

import java.util.Scanner; // imported Scanner
import java.util.Random; // imported random

public class ZodiacSigns { // class Name " Zodiac Signs"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("ID003");
		System.out.println("Enter the month you were born:  "); // asking user to enter their month
		int month = input.nextInt();
		System.out.println("Enter the day you were born: "); // asking user to enter their day of born
		int day = input.nextInt();
		int randomMonth = (int) (Math.random() * (12 - 1) + 1); // generating random month
		int randomDay = (int) (Math.random() * (31 - 1) + 1);// generating random day
		String sign = null;
		if (month == 1) { // if month equals 1

			if (day <= 19) // if day of the month is less than or equal to 19

				sign = " You are a Capricorn you can do it."; // Zodiac Sign according to Calendar

			else {

				sign = " Aquarius..huh..smart you little flirt.";
			}

		} else if (month == 2) { // if month equals 2

			if (day <= 18) // if day of the month is less than or equal to 18

				sign = " Congrats you're a Aquarius. "; // Zodiac Sign according to Calendar

			else {

				sign = " Pisces swimming in the water freely and emotional.";
			}

		} else if (month == 3) { // if month equals 3

			if (day <= 18) // if day of the month is less than or equal to 18

				sign = "  You're a Pisces.. smart, emotional, intelligent."; // Zodiac Sign according to Calendar
			else {
				sign = " Aries.  ";
			}
		} else if (month == 4) { // if month equals 4

			if (day <= 19) // if day of the month is less than or equal to 19

				sign = " Ooh your'e a Aries nice you'll meet someone amazing. "; // Zodiac Sign according to
																					// Calendar
			else {

				sign = " Taurus...go Bulls!";
			}

		} else if (month == 5) { // if month equals 5

			if (day <= 20) // if day of the month is less than or equal to 20

				sign = " Taurus...go Bulls!"; // Zodiac Sign according to Calendar

			else {

				sign = " Gooo Will SMith Gemini Man";
			}

		} else if (month == 6) { // if month equals 6

			if (day <= 20) // if day of the month is less than or equal to 20

				sign = " Gooo Will SMith Gemini Man"; // Zodiac Sign according to Calendar

			else {

				sign = " Youre a nice Guy and youre sign is Cancer";
			}
		} else if (month == 7) { // if month equals 7

			if (day <= 22) // if day of the month is less than or equal to 22

				sign = " Youre a nice Guy and youre sign is Cancer"; // Zodiac Sign according to Calendar

			else {

				sign = " Leo? Like Leo Leo? ";
			}

		} else if (month == 8) { // if month equals 8

			if (day <= 22) // if day of the month is less than or equal to 22

				sign = " You're a Leo ..now Roar like a Leo"; // Zodiac Sign according to Calendar

			else {

				sign = " You're a balanced Virgo from the show Beyblade";
			}

		} else if (month == 9) { // if month equals 9

			if (day <= 22) // if day of the month is less than or equal to 22

				sign = " You're a balanced Virgo from the show Beyblade"; // Zodiac Sign according to Calendar

			else {

				sign = "  Libra..huh..balanced I see";
			}
		} else if (month == 10) { // if month equals 10

			if (day <= 22) // if day of the month is less than or equal to 22

				sign = " A libra..huh..balanced I see"; // Zodiac Sign according to Calendar

			else {

				sign = "  Desert Scorpio";
			}
		} else if (month == 11) { // if month equals 11

			if (day <= 21) // if day of the month is less than or equal to 21

				sign = " A desert Scorpio "; // Zodiac Sign according to Calendar

			else {

				sign = " A sagittarius ride like wind bullseye";
			}
		} else if (month == 12) { // if month equals 12

			if (day <= 21) // if day of the month is less than or equal to 21

				sign = " A sagittarius ride like wind bullseye"; // Zodiac Sign according to Calendar

			else {

				sign = "Back to Capricorn aren't you";
			}
		}

		System.out.println("Congrats you are a " + sign);
		System.out.println("Generating random month and day:  " + randomMonth + " " + randomDay);
		String randomSign = null;
		if (randomMonth == 1) { // if random month equals 1

			if (randomDay <= 19) // if day of the month is less than or equal to 19

				randomSign = " You are a Capricorn, nice but judgemental."; // Zodiac Sign according to Calendar

			else {

				randomSign = " Aquarius..huh..smart but silly.";
			}

		} else if (randomMonth == 2) { // if month equals 2

			if (randomDay <= 18) // if day of the month is less than or equal to 18

				randomSign = " Aquarius..huh..smart but silly. "; // Zodiac Sign according to Calendar

			else {

				randomSign = " Pisces..friendly but secretly wants to murder you";
			}

		} else if (randomMonth == 3) { // if month equals 3

			if (randomDay <= 18) // if day of the month is less than or equal to 18

				randomSign = "  Pisces..friendly but secretly wants to murder you"; // Zodiac Sign according to Calendar
			else {
				randomSign = " Aries.  ";
			}
		} else if (randomMonth == 4) { // if month equals 4

			if (randomDay <= 19) // if day of the month is less than or equal to 19

				randomSign = " Ooh your'e a Aries someone hates you , but loves you. "; // Zodiac Sign according to
																						// Calendar
			else {

				randomSign = " Taurus...go Bulls!";
			}

		} else if (randomMonth == 5) { // if month equals 5

			if (randomDay <= 20) // if day of the month is less than or equal to 20

				randomSign = " Taurus...go Bulls!"; // Zodiac Sign according to Calendar

			else {

				randomSign = " Gemini...fake but super sweet";
			}

		} else if (randomMonth == 6) { // if month equals 6

			if (randomDay <= 20) // if day of the month is less than or equal to 20

				randomSign = " Gemini...fake but super sweet"; // Zodiac Sign according to Calendar

			else {

				randomSign = " Cancer..joker but not depressing";
			}
		} else if (randomMonth == 7) { // if month equals 7

			if (randomDay <= 22) // if day of the month is less than or equal to 22

				randomSign = " Cancer..joker but not depressing"; // Zodiac Sign according to Calendar

			else {

				randomSign = " Leo? Like Leo Leo? ";
			}

		} else if (randomMonth == 8) { // if month equals 8

			if (randomDay <= 22) // if day of the month is less than or equal to 22

				randomSign = " You're a Leo ..think you're right? No you're not"; // Zodiac Sign according to Calendar

			else {

				randomSign = " You're a balanced Virgo..Prude";
			}

		} else if (randomMonth == 9) { // if month equals 9

			if (randomDay <= 22) // if day of the month is less than or equal to 22

				randomSign = " You're a balanced Virgo ...Prude"; // Zodiac Sign according to Calendar

			else {

				randomSign = " A libra..huh..Harsh but supportive";
			}
		} else if (randomMonth == 10) { // if month equals 10

			if (randomDay <= 22) // if day of the month is less than or equal to 22

				randomSign = " A libra..huh..Harsh but supportive"; // Zodiac Sign according to Calendar

			else {

				randomSign = " A desert Scorpio";
			}
		} else if (randomMonth == 11) { // if month equals 11

			if (randomDay <= 21) // if day of the month is less than or equal to 21

				randomSign = " A desert Scorpio..angry but protective..just like Me "; // Zodiac Sign according to
																						// Calendar

			else {

				randomSign = " A sagittarius ride like wind bullseye";
			}
		} else if (randomMonth == 12) { // if month equals 12

			if (randomDay <= 21) // if day of the month is less than or equal to 21

				randomSign = " A sagittarius..mean but good horse"; // Zodiac Sign according to Calendar

			else {

				randomSign = "Back to Capricorn aren't you";
			}
		}

		System.out.println(randomSign);// prints out random month, day and sign

	}

}
