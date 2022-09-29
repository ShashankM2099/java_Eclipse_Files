package JavaFiles;
import java.util.Scanner;
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("To multiply: \nEnter a number");
		System.out.print("");
		double num1 = in.nextDouble();
		System.out.println("Enter another number: ");
		double num2 = in.nextDouble();
		double result = num1*num2;
		System.out.println("Numbers are : " + (num1 + "*"+ num2)+ ":= " + result);
		
		in.close();
	}

}
