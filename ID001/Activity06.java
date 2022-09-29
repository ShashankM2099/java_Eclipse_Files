package ID001;
import java.util.Scanner;
public class Activity06 {
	public static void main(String[] args) {
		double prebill, tipbill;
		Scanner input = new Scanner (System.in);
		System.out.println("Whats your bill-gates?:");
		prebill = input.nextDouble();
		System.out.println("Your Bill b4 the tip is: " +prebill);
		double tip= 0.15;
		double tippedbil= (prebill*tip);
		double completebill= (prebill+tippedbil);
		System.out.println("Your tipped amount is : " +tippedbil);
		System.out.println("your complete bill is: " +completebill);
		System.out.println("Thanks for coming and have a nice day..I'll be back!!!!");
		/*
		 * 
		 */
		int vacation, weeks, days;
		
		System.out.println("Are u gonna tell me how many days did u hibernate? :");
		days = input.nextInt();
		
		int goneweeks = days/7;
		int gonedays= days%7;
		
		System.out.println("That is " +goneweeks + " weeks " +gonedays + " days MARTHAAAAA");
	}
}
