package dayEx2;
import java.util.*;
public class decToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a int number to convert into Octal: ");
		int user = sc.nextInt();
		System.out.println("Decimal to Octal is: "+ Integer.toOctalString(user));
		sc.close();
	}

}
