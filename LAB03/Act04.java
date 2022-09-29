package LAB03;
import java.util.Scanner;
public class Act04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.println("Enter a year :");
		int year = input.nextInt();
		boolean isLeapYear=
				(year % 4 ==0 && year % 100 !=0 || (year %400 ==0));
	System.out.println(year + " is a Leap year? " + isLeapYear);
	}
}
