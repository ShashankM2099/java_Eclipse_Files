/*
 * author : {Shashank Mondrati]
 * version @ [4/10/2020}
 * Program: This program is divided into two parts. 
 * 
 * Part I describes as :  This program makes a card game that asks the user to pick a number from a normal shuffled 52 card deck. 
 * Next, the computer picks a random number between 0 to 51. 
 * The program should then display whose card was highest.
 * 
 * Part II : As a second part to the program, create an “auto play” mode is created, where two computers play against each other. 
 * Like the first part, each computer randomly picks a card and a message declares the one with the highest card. 
 * Deck is shuffled every turn, and allows the two computers to play 100 times before quitting. 
 * Once  played 100 times, displays the winner of the whole game (who had the most wins out of 100 turns), or if it ended in a draw.
 */
package LO8;

import java.util.*; // imported scanner, and arrayLIst mostly

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println(" \t \tID001");
		String[] deck = deckMaking(); // call to method
		String[] sDeck = deckShuffling(deck); // shuffling deck method callback

		Scanner scan = new Scanner(System.in); // scanner variable scan
		loop: while (true) {// game loop

			System.out.println(" Enter 1 for Part I, Enter 2 for Part II, or Enter -1 to Quit ");
			int choice = 0;
			try { // try and catch if user enters other than int values
				String str = scan.next();
				choice = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("Only Integers(1/2) allowed.");
				continue;
			}
			switch (choice) { // switch statement instead of using if's
			case 1: // case 1 ###########################################
				int cardValue, compCardValue; // initialized but not yet declared
				while (true) { // while loop
					try {
						System.out.println("Enter a card location from 0 to 51:");
						String card = scan.next();
						cardValue = Integer.parseInt(card);
					} catch (NumberFormatException e) {
						System.out.println("Only Integers allowed.");
						continue;
					}
					if (cardValue >= 0 && cardValue <= 51) { // range of cards from 0-51, because the index starts from
																// 0 and n minus 1
						break;
					} else {
						System.out.println("Invalid Input.");
					}
				}
				compCardValue = (int) (Math.random() * 52); // randomized b/w 0 and 52
				System.out.println(" Computer chose: " + compCardValue);
				System.out.println("You had the card value of " + sDeck[cardValue]);
				System.out.println("Computer has a " + sDeck[compCardValue]);
				if (declareWinner(sDeck[cardValue], sDeck[compCardValue]) == 1) { // if statment
					System.out.println("You the higher card value.");
				} else if (declareWinner(sDeck[cardValue], sDeck[compCardValue]) == -1) { // else if
					System.out.println(" Computer had the higher card");
				} else { // else
					System.out.println("It's a tie");
				}
				break;
			case 2: // case 2 ########################################
				int comp1_score = 0, comp2_score = 0;
				for (int i = 0; i < 100; i++) {
					int c1 = (int) (Math.random() * 52); // computer 1
					int c2 = (int) (Math.random() * 52); // computer 2
					if (declareWinner(sDeck[c1], sDeck[c2]) == 1) { // if statement
						System.out.println("Computer I had the higher card: " + sDeck[c1] + sDeck[c2]);
						comp1_score++;
					} else if (declareWinner(sDeck[c1], sDeck[c2]) == -1) { // else if statement
						System.out.println("Computer II had the higher card: " + sDeck[c2] + sDeck[c1]);
						comp2_score++;
					} else {
						System.out.println("Tie");
					}
					sDeck = deckShuffling(sDeck);
				}
				System.out.println("Computer 1 had " + comp1_score + " wins."); // comp1 score
				System.out.println("Computer 2 had " + comp2_score + " wins."); // comp2 score
				if (comp1_score > comp2_score) {
					System.out.println("Computer 1 won the game ##hackersWeAreThe___LEGION");
				} else if (comp1_score < comp2_score) {
					System.out.println("Computer 2 won the game ##We are the DedSec");
				} else {
					System.out.println("Stalemate...or its a TIE"); // else a tie
				}
				break;
			case -1: // case -1 ###################$$$$$$$$$$$$$$$$$$$$
				System.out.println(" Thanks for coming");
				break loop;
			default:
			}}}
	public static String[] deckMaking() { // deckMaking
		String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" }; // suits
		String[] levels = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" }; // levels in
																											// the deck
		String[] deckSorted = new String[52]; // single dimensional array size 52
		int i = 0;

		for (String Suit : suits) {
			for (String Rank : levels) {
				deckSorted[i++] = Rank + " of " + Suit;
			}}
		return deckSorted;}
	public static String[] deckShuffling(String[] deck) {
		String[] shuffledDeck = deck;
		for (int i = 0; i < 500; i++) {
			int card1 = (int) (Math.random() * 52); // randomizing
			int card2 = (int) (Math.random() * 52); // twice

			String temp = shuffledDeck[card1]; // shuffling the deck using temp
			shuffledDeck[card1] = shuffledDeck[card2];
			shuffledDeck[card2] = temp;
		}

		return shuffledDeck;
	}

	public static int declareWinner(String c1, String c2) { // declaring the winner method

		if (cardValue(c1) > cardValue(c2)) { // if cardValue is greather than 1
			return 1;
		} else if (cardValue(c1) < cardValue(c2)) {
			return -1;
		} else {
			return 0;
		}
	}

	public static int cardValue(String card) { // card value method.

		String[] arr = card.split(" ");
		int score = 0;

		switch (arr[0]) { // switch statement for Levels deck
		case "Ace":
			score += 1;
			break;
		case "2":
			score += 2;
			break;
		case "3":
			score += 3;
			break;
		case "4":
			score += 4;
			break;
		case "5":
			score += 5;
			break;
		case "6":
			score += 6;
			break;
		case "7":
			score += 7;
			break;
		case "8":
			score += 8;
			break;
		case "9":
			score += 9;
			break;
		case "10":
			score += 10;
			break;
		case "Jack":
			score += 11;
			break;
		case "Queen":
			score += 12;
			break;
		case "King":
			score += 13;
		}

		switch (arr[2]) { // switch statement for suits in a deck.
		case "Hearts":
			score += 0;
			break;
		case "Spades":
			score += 13;
			break;
		case "Clubs":
			score += 26;
			break;
		case "Diamonds":
			score += 39;
		}

		return score; // return statment
	}
}
