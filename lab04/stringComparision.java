package lab04;
import java.util.Scanner;
public class stringComparision {
	public static void main(String[] args) {
		Scanner sent = new Scanner(System.in);
		System.out.println("Enter your first string ");
		String s1 = sent.nextLine();
		System.out.println("Enter your second string ");
		String s2 = sent.nextLine();
		if ( s1.compareTo(s2)==0) {
			System.out.println("They match");
		}
		else {
			System.out.println("They dont");
		}
		System.out.println("Enter your 1st char");
		char c1 = sent.next().charAt(0);
		System.out.println("Enter your 2nd char");
		char c2 = sent.next().charAt(0);
		if (c1==c2) {
			System.out.println("We good homie");
		}
		else {
			System.out.println("We not good homie");
		}
	
	}
}
