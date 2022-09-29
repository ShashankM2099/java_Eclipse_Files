
package LAB03;

/*
 * Program Name : Assignment 03
 * author: [Shashank Mondrati]
 * version @ [4/18/2020]
 * Description : In this code, allows the user to choose between the following menu choices (menu-driven program):
 * Linear Search: 
 * Binary Search:
 * Bubble Search :
 * Selection Sort
 * Quit
 */
import java.util.*; // imported scanner and random for this project

public class Assignment3 {

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		String[] movieTitle = { "Gone with the Wind", "Star Wars", "The Truman Show", "The Martian", // movie titles
				"Blade Runner 2049", "Dunkirk", "Upstream Color", "La La Land", "The King�s Speech",
				"Pirates of the Caribbean" };
		int[] movieID = { 110100, 121101, 133310, 145601, 156711, 164210, 169901, 175501, 180000, 199900 }; // movie
																											// ID's
		double[] moviePrice = { 3.32, 43.25, 54.00, 67.32, 105.00, 113.22, 20.00, 42.25, 32.11, 123.75 }; // movie $$'s
		int[] quantityAvailable = { 11, 12, 13, 12, 14, 12, 19, 15, 18, 19 }; // quantity
		int choice; // choice where the user selects from 1-5
		int[] numbers = new int[10]; // numbers in an array
		Scanner input = new Scanner(System.in); // scanner variable called input
		do { // instead of while loop decided to go with do-while
			System.out.println(
					" 1. Linear Search \n 2. Binary Search \n 3. Bubble Sort \n 4. Selection Sort \n 5. Quit ");
			System.out.print(" Enter a Number Between 1 thru 5: "); // printing the menu
			choice = input.nextInt(); // nextInt
			// variables
			int movieId, movieCount, resultIndex;
			double startTime;
			double executionTime; // initialized variables but not declared yet
			Random random; // creating a new random variable initialized but not not yet declared
			switch (choice) { // using a switch case bc its my fav rather than if statements
			// different cases for (options)
			case 1: // case 1
				display(movieTitle, movieID, moviePrice); // method call back
				System.out.println("\n *** LINEAR SEARCH ***"); // linear search
				System.out.print(" Enter the movie ID you wish to purchase from the list mentioned above: ");
				movieId = input.nextInt(); // movie Id
				System.out.print("How many quantity of movies would you wish to purchase? ");
				movieCount = input.nextInt(); // movie count
				startTime = System.currentTimeMillis(); // staring the time

				resultIndex = linearSearch(movieID, movieId); // linear search
				executionTime = System.currentTimeMillis() - startTime; // execution time
				if (resultIndex != -1) { // if statement
					System.out.println("\nMovie ID: " + movieID[resultIndex]);
					System.out.println("Movie Title: " + movieTitle[resultIndex]);
					System.out.println("Movie Count: " + movieCount);
					System.out.println("Total Cost: " + (" $" + movieCount * moviePrice[resultIndex]));
					System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds"); // printing
																													// the
																													// time
																													// took
																													// to
																													// execute
				} else { // else statement
					System.out.println("Movie ID not found. Please enter a valid Movie Id");
				}
				break; // break tag
			case 2: // case 2
				display(movieTitle, movieID, moviePrice); // method call back
				System.out.println("\n $$$$ BINARY SEARCH $$$");
				System.out.print("Please enter the movie ID you wish to purchase from the list above: ");
				movieId = input.nextInt();
				System.out.print("How many movies do you wish to purchase: ");
				movieCount = input.nextInt();
				// attempted the extra credit but i don't think it is right at all
				startTime = System.currentTimeMillis(); // starting time for execution
				resultIndex = binarySearch(movieID, movieId);
				executionTime = System.currentTimeMillis() - startTime;
				if (resultIndex != -1) { // if statement
					System.out.println("\nMovie ID: " + movieID[resultIndex]);
					System.out.println("Movie Title: " + movieTitle[resultIndex]);
					System.out.println("Movie Count: " + movieCount);
					System.out.println("Total Cost: " + (" $" + movieCount * moviePrice[resultIndex]));
					System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds"); // printing
																													// time
																													// for
																													// exec
				} else { // else statement
					System.out.println("Movie ID not found. Please enter a valid Movie Id");
				}
				break; // break tag
			case 3: // case 3
				System.out.println("\n @#$ BUBBLE SORT %$#"); // for bubble sort
				random = new Random(); // new random
				for (int i = 0; i < 10; i++) { // for loop
					numbers[i] = random.nextInt(500);
				}
				System.out.println("\nThe unsorted array is: "); // the unsorted array
				for (int i = 0; i < 10; i++) { // for loop
					System.out.print(numbers[i] + " ");
				}
				startTime = System.currentTimeMillis(); // starting the exec time
				numbers = bubbleSort(numbers);
				executionTime = System.currentTimeMillis() - startTime; // the complete final exec time

				System.out.println("\nSorted array is: "); // the sorted array
				for (int i = 0; i < 10; i++) { // for loop
					System.out.print(numbers[i] + " ");
				}
				System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds"); // printing
																												// the
																												// time
				break; // break tag
			case 4: // case 4
				System.out.println("\n #$##$# SELECTION SORT #$#$#$"); // for selection sort
				random = new Random(); // new random
				for (int i = 0; i < 10; i++) { // for loop
					numbers[i] = random.nextInt(500);

				}
				System.out.println("\nThe unsorted array is: "); // the unsorted array
				for (int i = 0; i < 10; i++) { // for loop
					System.out.print(numbers[i] + " ");

				}

				System.out.println("\nThe unsorted availible quanity of movies are: "); // for movies
				for (int i = 0; i < 10; i++) { // for loop
					System.out.print(quantityAvailable[i] + " ");
				}

				startTime = System.currentTimeMillis();

				quantityAvailable = selectionSort(quantityAvailable);
				executionTime = System.currentTimeMillis() - startTime;
				System.out.println("\n");
				System.out.println("\nSorted array is: ");
				for (int i = 0; i < 10; i++) { // for loop
					System.out.print(numbers[i] + " ");

				}

				System.out.println("\nThe sorted availible quanity of movies are: ");
				for (int i = 0; i < 10; i++) { // for loop for sorted quantity of movies

					System.out.print(quantityAvailable[i] + " ");
				}

				System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds");
				break; // break tag
			}
		} while (choice != 5); // in a do-while loop if the choice doesnt equal 5
		input.close(); // closing ..its a new technique instead of writing a exit method.
	}

	// methods used
	public static void display(String[] movieTitle, int[] movieID, double[] moviePrice) { // display method void return
																							// type
		System.out.println("Movie ID Cost");
		int maxTitleLength = 50;
		for (int i = 0; i < movieTitle.length; i++) { // for loop
			System.out.print(movieID[i] + " " + movieTitle[i]);
			int spaces = maxTitleLength - movieTitle[i].length();
			for (int k = 0; k < spaces; k++) {
			} // for loop
			System.out.println(moviePrice[i]);
		}
	}

	public static int linearSearch(int[] movieIDs, int movieId) { // linear search method return type: int
		int resultIndex = -1;
		for (int i = 0; i < movieIDs.length; i++) { // for loop
			if (movieIDs[i] == movieId) { // if statement
				resultIndex = i;
			}
		}
		return resultIndex; // return type
	}

	public static int binarySearch(int[] movieIDs, int movieId) { // binary searching method
																	// return type int
		int resultIndex = -1;
		int first = 0;
		int last = movieIDs.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) { // while loop
			if (movieIDs[middle] < movieId) { // if statement
				first = middle + 1;
			} else if (movieIDs[middle] == movieId) { // else if statemnent
				resultIndex = middle;
				break; // break tag
			} else { // else statement
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) // if statement
			resultIndex = -1;
		return resultIndex; // return type
	}

	public static int[] bubbleSort(int[] arr) { // bubble sorting method return type int
		for (int i = arr.length - 1; i >= 0; i--) { // for loop
			// bubble up
			for (int j = 0; j <= i - 1; j++) { // nested for loop should work
				if (arr[j] > arr[j + 1])
					swap(arr, j, j + 1);
			}
		}
		return arr; // returns an int val
	}

	public static int[] selectionSort(int[] arr) { // selection sorting method return type : int
		for (int i = 0; i < arr.length - 1; i++) { // for loop
			int min = i; // record the position of the smallest
			for (int j = i + 1; j < arr.length; j++) { // nested for loop
				// update min when finding a smaller element
				if (arr[j] < arr[min]) // if statement
					min = j;
			}
			// put the smallest element at position i
			swap(arr, i, min); // method call back
		}
		return arr; // returns an int
	}

	public static void swap(int[] arr, int i, int j) { // tried this swapping from the textbook should work
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
