package LO6;
import java.util.Scanner;

public class act01 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string.");
	String str = scan.next();
	char[]activity = new char[str.length()];
	for(int i = 0; i < str.length(); i++) {
		activity[i]=str.charAt(i);
	}
	
	for (char actv : activity) {
		System.out.println(actv);
	}
}
}
