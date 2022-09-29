package helloWorld;
import java.util.Scanner;
public class SumSubjectAverage {
	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Whats your Maths Marks?: ");
		 double Maths= input.nextDouble();
		 System.out.println("Whats ur Earth marks?: ");
		 double Earth= input.nextDouble();
		 System.out.println("what are ur Geography marks:?" );
		 double Geography= input.nextDouble();
		 System.out.println("## Press A to find Average, S for sum:: ");
		 String option = input.next();
		 if(option.equals("A")) {
			 double average= (Maths+ Earth+Geography)/(3); 
			 System.out.println(average);
		 } else {
			 System.out.println("## Input is incorrect");
		 }
		 
		 
		 
		 
		
		 
	}
}
