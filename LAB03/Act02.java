	package LAB03;
import java.util.Scanner;
public class Act02 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to Gordon's Ramsays F-Word");
		System.out.println("Can I know your discount code ?");
		int code= input.nextInt();
		double discount=0;
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
	}
}


