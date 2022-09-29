package dayEx1;
import java.util.*;
public class capitalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want capitalized: ");
		String userStr = sc.nextLine();
		String cap = userStr.toUpperCase();
		System.out.println(cap);
		sc.close();

	}

}
