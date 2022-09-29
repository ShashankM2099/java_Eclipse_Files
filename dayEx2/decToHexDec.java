package dayEx2;
import java.util.*;	
public class decToHexDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a int number to convert to Hex: ");
		int userDec = sc.nextInt();
		System.out.println("Decimal to Hexadecimal is: "+ Integer.toHexString(userDec));
		sc.close();

	}

}
