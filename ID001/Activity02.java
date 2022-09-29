/*This is a simple division program
 * 
 */
package ID001;
import java.util.Scanner;
public class Activity02 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		float  dividend, divisor; // Used the variables dividend and divisor
		System.out.println("Whats your Dividend? :");
		 dividend = input.nextInt(); 
		 System.out.println("Whats your Divisor");
		 divisor= input.nextInt();
		 float quotient= (dividend/divisor);
		 System.out.println("Your answer for the following input is: " +quotient);
		 System.out.println("Aaaaand now to use the modulus");
		 float x, y;
		 
		 System.out.println("Whats your X? :");
		 x = input.nextFloat();
		 System.out.println("Whats your Y? :");
		 y= input.nextFloat();
		 if (y==0) {
			 System.out.println("Suck on that suckers it doesnt divide by Zero-Hero");
		 }
		 float remainder= (x%y);
		 System.out.println("Aaaaaaaaaand your remainder is: " +remainder);
		 
		 System.out.println("The quotient is "+ quotient + " and the remainder is "+remainder);
		
	
}
}
