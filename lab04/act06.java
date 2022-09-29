package lab04;
import java.text.DecimalFormat;
import java.util.Scanner;
public class act06 {
public static void main (String [] args ) {
	Scanner numbers = new Scanner (System.in);
    DecimalFormat df2 = new DecimalFormat("#.##");

	System.out.println("Enter your first Num");
	double w1 = numbers.nextDouble();
	System.out.println("Enter your second number");
	double w2 = numbers.nextDouble();
	double c = w1/w2;

	System.out.println(df2.format(c));
	
}
}
