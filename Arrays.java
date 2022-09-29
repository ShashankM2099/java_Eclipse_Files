import java.util.*;
import java.io.*;

public class Arrays {

	public static void main(String[] args) {
//		Asking user for input for an array and adding thenm up to divide
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[7];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter the numbers in your array: ");
			numbers[i] = sc.nextInt();
			count += numbers[i];
		}

		System.out.println(" Arrays numbers are: " + String.valueOf(numbers));
		int div = count / numbers.length;
		System.out.println("Division is: " + div);
		sc.close();

	}

}
