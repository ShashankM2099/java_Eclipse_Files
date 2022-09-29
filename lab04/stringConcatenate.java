package lab04;
import java.util.Scanner;
public class stringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner thought= new Scanner (System.in);
		System.out.println("Enter your thougths on TA's in 3 sentences or less:");
		String firstL = thought.nextLine();
		String secondL= thought.nextLine();
		String thirdL= thought.nextLine();
		String finalL= firstL.concat(" ." ).concat(secondL).concat(" .").concat(thirdL);
		String yourTA = "Your final thoughts on the TA : " + finalL;
		char firstCh= firstL.charAt(0);
		System.out.println(finalL);
		char lastCh= finalL.charAt(finalL.length()-1);
		int sLength= finalL.length();
		int middle = sLength/2;
		char c = finalL.charAt(middle);
		System.out.println(yourTA);
		System.out.println("FINAL LENGTH " + finalL.length());
		System.out.println("Your first char is " + firstCh);
		System.out.println("your last char is: " + lastCh);
		System.out.println("Your middle index is " + c);
	}

}
