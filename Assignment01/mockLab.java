/*
 * Program Name : Mock Lab Test 1
 * Programmer : Shashank Mondrati
 * Date : 2/ 11/ 2020
 * Lab Section : ITSC-1212 003
 * Purpose: A program that calculates a customer's bill. Program will ask what package 
 * did the customer choose and how many minutes and data were used.
 * Algorithms:
 * Case A contains 450 minutes and an  additional 0.45 for extra min, 10$ per 0.2 MB
 * Case B contains 900 minutes and an additional 0.40 for extra min, 10$ per 0.25MB
 * Case C contains unlimited
 */
package Assignment01;
import java.util.Scanner; // imported scanner
public class mockLab { // class name mockLab
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in); //imported scanner
	System.out.println("What is your choice of Package? A or B or C");//prompts the user for the designated package choosing

	
String purchase= input.nextLine();// String to choose package
	switch(purchase) { //switch statement for package purchasing
	case "A":
		
		System.out.println("For your current month, how many minutes you spent on your phone?");
		double minutes= input.nextDouble();
		System.out.println("What was your data usage?");
		double A= 39.99; // package A
	 double B = 59.99; // package B
	 double C= 69.99; // package C
		double extraMin= (minutes/450) *(0.45); // additional minutes
		double dataUsage= input.nextDouble();
		double dataUse=   1+ (dataUsage/0.2) *(10); // additional data usage
		double minBill= (extraMin + dataUse) +A  ;
		System.out.println("Your bill for the month would be: " + minBill); // final Bill for package A
		System.out.println(" Package B would have been  " +B);
		System.out.println("Package C would have been " +  C);
		System.out.println(" You would have saved  " + (minBill - B) + " by switching to Package B , and " + (minBill - C) + " by switching to Package C");
		break;
	case "B":
		B= 59.99; 

		System.out.println("For your current month, how many minutes you spent on your phone?");
		 minutes= input.nextDouble();
		System.out.println("What was your data usage?");
		 extraMin= (minutes/900) *(0.40); // additional minutes
		 dataUsage= input.nextDouble();
		 dataUse=   2+ (dataUsage/0.25) *(10); // additional data usage
		 minBill= (extraMin + dataUse) +B  ;
		System.out.println("Your bill for the month would be: " + minBill); // final bill for package B
		break;
	case "C":
		C= 69.99;

		System.out.println("For your current month, how many minutes you spent on your phone?");
		minutes = input.nextDouble();

		System.out.println("What was your data usage?");
		 dataUsage= input.nextDouble();
		 dataUse=   1+ (dataUsage/20) *(10); // additional data usage
		 minBill= (minutes + dataUse)   ;
		System.out.println("Your bill for the month would be: " + minBill); // final Bill for package C
		
}
	
	}
	}


