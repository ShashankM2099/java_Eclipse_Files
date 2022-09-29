/*
 * author: [Shashank Mondrati]
 * version @ [3/7/2020]
 * Program: This program presents that displays the first 50 prime numbers in 5 lines each containing
 * 10 numbers.
 */

package helloWorld;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_PRIMES = 50; //Number of Primes to display
		final int NUMBER_OF_PRIMES_PER_LINE=10; //Display 10/Line
		int count = 10; // Count the number of prime numbers
		int number =2; // A number to be tested for primeness
		
		System.out.println("The first 50 prime numbers are \n");
		
		// Repeatedly find prime numbers
		while(count < NUMBER_OF_PRIMES) {
			// Assume the number is prime
			
			boolean isPrime = true; // IS the current number prime?
			
			//Test another
			 for (int divisor=2; divisor <=number /2; divisor++) {
				 if (number % divisor ==0) {
					 isPrime = false;
					 break;
				 }
			 }
			 if (isPrime) {
				 count++;
				 if(count % NUMBER_OF_PRIMES_PER_LINE==0) {
					 //Display the number and advance to the new line
					 System.out.println(number);
				 }
				 else 
					 System.out.println(number + " ");
			 }
			 // Check if the number is prime
			 number++;
		}

	}

}
