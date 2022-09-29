package LAB03;
import java.util.Scanner;
public class Act03 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		//Welcome Message
		System.out.println("Welcome to Gordon's Ramsays F-Word");
		//Bill Amount
		System.out.println("Enter your bill amount:");
		double bill =input.nextDouble();
		
		//Enter Discount
		System.out.println("Can I know your discount-code");
		int code= input.nextInt();
		double discount=0;
		//Switch Statement for coupon code
		switch (code){
		case 2014:
			 discount = 0.15;
			System.out.println("Congrats you got : " + discount + " % off");
				break;
		case 2015 : 
			 discount = 0.10; 
			 System.out.println("Congrats you got: " + discount + " % off!");
			 break;
		case 2016:
			discount= 0.05;
			System.out.println("Congrats you got: " + discount+ " %  off!");
		break;
		default:
			System.out.println("Invalid Coupon Code Mistah J");
		}
		//Tax
		final double tax = 1.046;
		//Compute total bill
		double discounted = bill * discount;
		double totalBill = bill - discounted;
		double totalBillTax = totalBill * tax;
		//Display total bill
		System.out.println("Your total bill is " + totalBillTax);

	}
}
