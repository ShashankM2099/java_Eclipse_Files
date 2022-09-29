/*@author Shashank Mondrati
 * @version 1.0.1
 * @date 1/26/2020
 *  What's the output with the input value of 1.99?
 *  Enter an amount in double : 
1.99
Your amount 1.99 consists of 
your amount 1 dollars 
Your amount 3 Quarters
your amount 2 Dimes
your amount 0 Nickels
Your amount 4 Pennies

 
 */
package ID001;
import java.util.Scanner;
public class MonetaryUnits {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an amount in double : ");
		double amount = input.nextDouble();
		 
		int remainingAmount = (int)(amount * 100);
		 int numOfOneDollars = remainingAmount / 100;
		 remainingAmount = remainingAmount % 100;
		 
		 int numOfQuarters = remainingAmount / 25;
		 remainingAmount = remainingAmount % 25;
		 
		 int numOfDimes = remainingAmount / 10;
		 remainingAmount = remainingAmount %10;
		 
		 int numOfNickels = remainingAmount / 5;
		 remainingAmount = remainingAmount % 5;
		 int numOfPennies = remainingAmount;
		 
		 System.out.println("Your amount " +amount + " consists of ");
		 System.out.println("your amount " +numOfOneDollars+ " dollars ");
		 System.out.println("Your amount " +numOfQuarters+ " Quarters");
		 System.out.println("your amount " +numOfDimes+ " Dimes");
		 System.out.println("your amount " +numOfNickels+ " Nickels");
		 System.out.println("Your amount " +numOfPennies+ " Pennies");
	}
}
