package LO7;

import java.util.Scanner;

public class calculatorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println(" What would you like to do");
		System.out.println(
				" 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n. 5. Distance between two points \n. 6. Square Root \n 7. Exponential E-Value");
		int ch = scan.nextInt();
		switch (ch) {
		case 1:
			System.out.println(" Enter your first num");
			num1 = scan.nextInt();
			System.out.println(" Enter your second num");
			num2 = scan.nextInt();
			System.out.println(" Your sum is :" + add(num1, num2));
			break;
		case 2:
			System.out.println(" Enter your first num");
			num1 = scan.nextInt();
			System.out.println(" Enter your second num");
			num2 = scan.nextInt();
			System.out.println(" Your subtraction is " + subtract(num1, num2));
			break;
		case 3:
			System.out.println(" Enter your first num");
			num1 = scan.nextInt();
			System.out.println(" Enter your second num");
			num2 = scan.nextInt();
			System.out.println(" Your Multiplication is: " + multiply(num1, num2));
			break;
		case 4:
			System.out.println(" Enter your first num");
			num1 = scan.nextInt();
			System.out.println(" Enter your second num");
			num2 = scan.nextInt();
			System.out.println(" Your division is " + division(num1, num2));
			break;
		case 5:
			System.out.println(" Enter your X1");
			num1 = scan.nextInt();
			System.out.println(" Enter your X2");
			num2 = scan.nextInt();
			System.out.println(" Enter your Y1");
			int num3 = scan.nextInt();
			System.out.println(" Enter your Y2");
			int num4 = scan.nextInt();
			System.out.println(" Your distance between two points is" + distance(num1, num2, num3, num4));
			break;
		case 6:
			System.out.println(" Enter a Number");
			double num = scan.nextDouble();
			System.out.println(" Your square rooted answer is " + root(num));
			break;
		case 7:
			System.out.println(" Enter your Number");
			num = scan.nextDouble();
			System.out.println(" Your number is " + evalue(num));

		}

	}

	private static double evalue(double num) {
		// TODO Auto-generated method stub
		double ev = 2.718281828;

		double evalue = Math.pow(ev, num);
		return evalue;
	}

	private static double root(double num) {
		// TODO Auto-generated method stub
		double root = Math.sqrt(num);
		return root;
	}

	private static double distance(int num1, int num2, int num3, int num4) {
		// TODO Auto-generated method stub
		double distance = Math.pow((Math.pow((num2 - num1), 2) + Math.pow((num4 - num3), 2)), 1 / 2);
		return distance;
	}

	public static int division(int num1, int num2) {
		// TODO Auto-generated method stub
		int division = (num1) / (num2);
		return division;
	}

	public static int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		int multiply = (num1) * (num2);
		return multiply;
	}

	public static int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		int subtract = num1 - num2;
		return subtract;
	}

	public static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int add = num1 + num2;
		return add;
	}

}
