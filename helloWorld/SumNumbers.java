package helloWorld;
import java.util.Scanner;
public class SumNumbers {
	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter the radius of your circle: ");
		    int radius = input.nextInt();

		    double diameter = (2 * radius);
		    System.out.println("Our diameter equals " + diameter + "\n");

		    System.out.println("Now let's calculate circumference!");
		    double circumference = diameter * Math.PI;
		    System.out.println("Circumference is " + circumference + "\n");

		    System.out.println("What is the area?");
		    int area = (int)(Math.PI * Math.pow(radius, 2));
		    System.out.println("Our area is " + area + "\n");

		    System.out.println("Goodbye! Have a great day.");
	}
}
