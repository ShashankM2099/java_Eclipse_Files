/*
 * author : @[ Shashank Mondrati]
 * version @ [3/4/2020]
 * Program: Allow the user to enter two coordinate points (an x and y value for each point). 
 * Then displays the distance between these two points. 
 */
package helloWorld;
import java.util.Scanner;
public class Distance {
public static void main(String [] args) {
	Scanner numbers = new Scanner(System.in); // Scanner input
	System.out.println("ID001"); // ID001
	System.out.println("Please enter your two points:");

	System.out.println("Enter your X1 Value"); 

	double x1 = numbers.nextDouble(); // Asking user's input for X1

	System.out.println("Enter your X2 Value");

	double x2 = numbers.nextDouble(); // Asking user's input for X2

	System.out.println("Enter your Y1 Value");

	double y1 = numbers.nextDouble(); // Asking user's input for Y1

	System.out.println("Enter your Y2 Value");

	double y2 = numbers.nextDouble(); // Asking user's input for Y2

	double a = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)); // Distance formula
	double roundedA = Math.round(a);
	System.out.println("The Distance is : " + roundedA);
}
}
