package lab04;
import java.util.Scanner;
public class activity05 {
	public static void main(String[] args) {
		Scanner recog = new Scanner (System.in);
		String s1 = "The trouble with programmers is that you can never tell what a programmer is doing until it's too late";
		System.out.println(s1);
		System.out.println("Length is " +s1.length());
		System.out.println("Enter a string to see if its within the quote");
		String word = recog.nextLine();
		int fIndex = s1.indexOf(word);
		System.out.println(fIndex);
		System.out.println(" Enter a character");
		char c1 = recog.next().charAt(0);
		if (s1.indexOf(c1)>0) {
			System.out.println(s1.indexOf(c1));
		}
		System.out.println("Enter a number ");
		int n1 = recog.nextInt();
		if (n1>=0 && n1< s1.length()-1) {
	System.out.println(s1.charAt(n1));
		}
		System.out.println(s1);
		int space = s1.indexOf(" ",9);
		String cap = "TROUBLE";
		String replace = s1.replace("trouble", cap);
		System.out.println(replace);
		String sey = " - Seymore Clay";
		String finalq = s1.concat(sey);
		System.out.println(finalq);
}
}
