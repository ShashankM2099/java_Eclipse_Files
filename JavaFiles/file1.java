package JavaFiles;
import java.util.*;
public class file1 {
	public static void main(String []args) {
		System.out.println("Enter a numbers");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int sqauredNum = (int)Math.pow(number, 2);
		System.out.println("Squared Number: "+ sqauredNum);
	}
}
