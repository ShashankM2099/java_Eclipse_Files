package JavaFiles;
import java.util.*;
public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your numerator: ");
		double num1 = in.nextDouble();
		System.out.println("Enter your denominator: ");
		double num2 = in.nextDouble();
		double result = num1/num2;
		System.out.println("Result: "+ result);
		
		in.close();
	}

}
