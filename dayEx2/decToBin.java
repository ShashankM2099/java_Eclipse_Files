package dayEx2;
import java.util.*;
public class decToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a int decimal number: ");
		int userDec = sc.nextInt();
		System.out.println("Decimal of "+ userDec + " is: "+ Integer.toBinaryString(userDec));
		sc.close();
	}

}
