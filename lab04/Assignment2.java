package lab04;
/*
 * author: [Shashank Mondrati]
 * author ![ 3/22/2020]
 * Program: The program will display a menu with each option above, 
 * and then ask the user to enter their choice. 
 * There is also be a tenth option (option J) to quit, in which case, the program will simply display a goodbye message.
 *  Based on the user’s choice, this program will perform the chosen functionality. 
 *  There is also proper output for all cases (such as instructions, questions to the user, or directions telling the user to input something specific).
 *  The options are as follows when the user chooses.
 *  A. User enters a main sentence which can be used for other options
 *  B. Searching for a string :  Asks the user to input a word, then the code displays the first occurence of the words' index.
 *  C. Searching for all incidents in the string : Same as option two, but displays every occurences as its displays their indexes.
 *  D Search and Capitalize: User enters a char/word, then the code caps the first letter of the word and displays the new string.
 *  E. Replace : Program asks the user what the word should be replaced with, and prints out the new string with the replaced word.
 *  F. Word Count : This option just shows how many words did the user typed in option A.
 *  G. Letter occurences : Program asks the user for how many times did one char/ word appeared in the string entered.
 *  H. Letter count: This option just displays how many letters are in the string without the spaces between words.
 *  I. Delete a word: This option is rather similar to replace, but with another word, string is replaced with an empty gap.
 *  J. Exit: Until the user chooses this option, the program loops and displays a good bye text.
 */
import java.util.Scanner; // imported scanner
public class Assignment2 { // class name
	static Scanner scan = new Scanner(System.in); // scanner variable scan
	static String searchWord;
	static String replaceWord; // static variables initialized declared in the options further.
	static String word;

	public static void main(String[] args) { // main method
		String mainSentence = null;
		// TODO Auto-generated method stub
		while (true) { // while loop true
			char choice = searchIndex(); // users enters a char based on their choice
			if (choice == 'J') {
				exit(); // if statement
								// if user enters J displays a exit message.
				break;
			}
			if (choice == 'A') { // if users enter A...
				mainSentence = newMainSentence(); // enters a main sentence
			}

			switch (choice) { // switch statements
			case 'B': {
				System.out.println(" Enter a word to search for its Index: ");
				 word = scan.next();
				searchStringIndex(mainSentence, word); // searching stringIndex method

				break; // break tag
			}
			case 'C':
				// searching for a char in the entire string
				System.out.println(" Enter a word");
				 word = scan.next();

				searchAllString(mainSentence, word); // method

				break;
			case 'D':
				System.out.println(" Enter a word you wish to capitalize"); // user enters the word/char
				word = scan.next();
				// search for a string if its within the string, and cap it (part of it)
				capitalizeString(mainSentence, word); // method

				break;

			case 'E': // replacing string
				System.out.println(" Enter a character from the string: ");
				searchWord = scan.next();
				System.out.println(" Enter a word you would like to replace with");
				replaceWord = scan.next();
				replaceString(mainSentence, searchWord, replaceWord);

				break;
			case 'F': // count the # of words
				countWords(mainSentence); // method call back

				break;

			case 'G':
				// counting a letters occurences
				System.out.println(" Enter a string for ## of occurences"); // user enters a char for # of occurences
				String word2 = scan.next();
				int countOccurrencesLetter = countOccurrencesLetter(mainSentence, word2); // displays as int values
				System.out.println(" Occurences are " + countOccurrencesLetter);

				break;

			case 'H': // # of letters in the user entered-String

				countLetters(mainSentence); // method call back
				break;

			case 'I': // delete all occurences of a word(or char) in a string
				System.out.println(" Enter a word or char you would like to delete : ");
				word = scan.nextLine();
				deleteWord(mainSentence, word);
			}
			continue; // loop continues
		}
	}

	public static String capitalizeString(String mainSentence, String word) { // capitalizing the string method.
		String capitalizeString = "";
		System.out.println(" Press y to capitalize");
		String option = scan.next();
		if ( option.equals("y")) {
			int let = mainSentence.indexOf(word);
			if(let>=0){
				String line = mainSentence.substring(let); // substring of the index of the user entered word
				String upperC = line.substring(0, 1).toUpperCase();
				capitalizeString = mainSentence.substring(0, let) + mainSentence.substring(let, let + 1).toUpperCase()
						+ mainSentence.substring(let + 1);
				System.out.println(" Your new capitalized sentence is: " + capitalizeString);
				return capitalizeString;
			} else {
				return "Word not found";
			}
			
		}
		else {
			return " Word Not Capitalized";
		}
	}

	public static String searchAllString(String mainSentence, String word) { // searching for a string in sentence
		 // char at 0
		String indexes = "";
		for (int i = 0; i < mainSentence.length(); i++) { // for loop
			if (String.valueOf(mainSentence.charAt(i)).equals(word)) { // if statement
				indexes = indexes + String.valueOf(i);
				if (i != mainSentence.length() - 1) { // if statement
					indexes = indexes + ",";
				}
			}
		}

		if(indexes!=null && indexes.length()>1) {
			String searchAllString = null;
			if (indexes.endsWith(",")) { // if statement
				searchAllString = indexes.substring(0, indexes.length() - 1);
			} else {
				searchAllString = indexes;
			}
			
			System.out.println("Indexes [" + searchAllString + "]");
			return "[" + searchAllString + "]";
		} else {
			return "not found!";
		}
		
	}

	public static int countOccurrencesLetter(String mainSentence, String word) { // char occurence method
		// TODO Auto-generated method stub
		int sum = 0; // starting with 0

		for (int i = 0; i < mainSentence.length(); i++) { // for loop

			char charAtI = mainSentence.charAt(i);

			if (charAtI == word.charAt(0)) // if statement
				sum++;
		}
		return sum;
	}

	public static String deleteWord(String mainSentence, String word) { // deleting a char/word from the user-entered string.
		// TODO Auto-generated method stub
			String deleteWord = mainSentence.replace(word, ""); // deleting a char/word in a string using the replace method
			System.out.println(" Your new sentence is: " + deleteWord);
			return deleteWord;
	}

	public static int countLetters(String mainSentence) { // counting letters method in a string
		// TODO Auto-generated method stub
		int countLetters = 0;

		// Counts each character except space
		for (int i = 0; i < mainSentence.length(); i++) { // for loop
			if (mainSentence.charAt(i) != ' ') // if statement
				countLetters++;
		}

		System.out.println(" Total ## of letters in the String: " + countLetters);
		return countLetters;

	}

	public static int countWords(String mainSentence) { // counting words in a string
		// TODO Auto-generated method stub
		int countWords = 0;
		if (!(" ".equals(mainSentence.substring(0, 1))) || !(" ".equals(mainSentence.substring(mainSentence.length() - 1)))) {
			for (int i = 0; i < mainSentence.length(); i++) {
				if (mainSentence.charAt(i) == ' ') {
					countWords++;
				}
			}
			countWords = countWords + 1;
		}
		System.out.println(" Number of words in the string are:  " + countWords); // returns as a 0 if string starts or
																					// ends with space " ".
		return countWords;
	}

	public static String replaceString(String mainSentence, String searchWord, String replaceWord) { // replacing string with
																								// another string
		// TODO Auto-generated method stub
		
		String replaceString = mainSentence.replace(searchWord, replaceWord); // replace method.
		System.out.println("Your new strings with replacements is:  " + replaceString);
		return replaceString;

	}

	public static String newMainSentence() { // main sentence method
		System.out.println(" Enter a String");
		Scanner scanner = new Scanner(System.in); // another scanner
		String mainSentence = scanner.nextLine();
		return mainSentence;
	}

	public static String exit() {
		System.out.println(" Bye ;)"); // exit method.
		// TODO Auto-generated method stub
		return "Bye! :)";

	}

	public static int searchStringIndex(String mainSentence, String word) { // searching a specified string in the user-entered
																// string and di
																// and displaying its index
		
		int index = mainSentence.indexOf(word);
		if (index >= 0) { // if statement
			System.out.println(" Index of sentence " + mainSentence.indexOf(word));
			return index;
		} else {// else statement
			System.out.println("not found!");
		return index;
		}
		 
	}

	public static char searchIndex() { // main menu index method
		System.out.println(" \t\t Main Menu " + "\n A. Enter a new Sentence " + " \n B. Search for String" + ""
				+ "\n C.Search for all incidents of a string. "
				+ " \n D. Search for and capitalize a String if necessary"
				+ " \n E.Replace all incidents of a string to another one" + "" + " \n F.Count the number of words."
				+ " \n G. Count the number of occurrences of a letter" + " \n H. Count the total number of letters. "
				+ " \n I.Delete all occurrences of a word. " + " \n J. Exit ");
		char choice = scan.next().charAt(0);
		return choice;
	}

}
