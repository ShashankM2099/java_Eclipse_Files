package dayEx2;
import java.util.*;
public class binaryMulto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first binary Number: "); // taking them as format of string should be easy
		String binOne = sc.next();
		System.out.println("Enter your second binary Number: ");
		String binTwo = sc.next();
		// trying converting them
		int cOne = Integer.parseInt(binOne, 2); // parses the binaryOne as a int by a radix of 2
		int cTwo = Integer.parseInt(binTwo, 2);
		System.out.println("Product of two binary strings are: "+ Integer.toBinaryString(cOne*cTwo));
		sc.close();
	}
}
