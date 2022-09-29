/*
 * author: [Shashank Mondrati]
 * version @ [ 4/3/2020]
 * Program :  This code writes a program that finds the number of items above the avg of all items.
 */
package LO7;
import java.util.Scanner; // imported scanner
public class analyzingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); // new scanner
		System.out.println(" ID001");
		System.out.println(" Enter the number of items");
		int n = input.nextInt();
		double [] numbers = new double [n]; // initialzing and declaring an array based on user input
		double sum = 0; // 
		System.out.println(" Enter the numbers  ");
		for ( int i =0 ; i<n ; i++) { // for loop
			numbers [i] = input.nextDouble(); // storing numbers in an array
			sum += numbers[i];
			
		}
		double average = sum / n; // average 
		int count  = 0; // num of elements above average
		 for ( int i=0; i<n; i++) { // for loop
			 if (numbers[i]> average) // if statement
				 count ++;
			 System.out.println(" Average is" + average);
			 System.out.println(" Number of elements above the average is" + count);
		 }
	}

}
