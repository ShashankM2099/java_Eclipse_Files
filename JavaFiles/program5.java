package JavaFiles;
import java.util.Scanner;
public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("To multiply, Subtract, divide, and remainder: \nEnter two numbers: ");
		double num1 = in.nextDouble();
		System.out.println("Enter another number: ");
		double num2 = in.nextDouble();
		results(num1,num2);
		in.close();
	}

	protected static void results(double userNum1, double userNum2) {
		// TODO Auto-generated method stub
		double add = userNum1 + userNum2;
		double subtract = userNum2 - userNum1;
		double multiply = userNum1 * userNum2;
		double divide = userNum1/userNum2;
		double mod = userNum1%userNum2;
		System.out.println("Results:=\n Addition:="+ add 
				+ "\n Subtraction:= " + subtract 
				+"\n Multiply:= "+ multiply +" \n Divide:= "+ divide + "  \n Mod:=" + mod);
	}

}
