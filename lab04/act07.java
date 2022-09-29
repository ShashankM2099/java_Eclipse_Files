package lab04;
import java.util.Scanner;
public class act07 {
public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	int guessing;
	System.out.println("What rolll");
	guessing = input.nextInt();
	
	int dice1 = (int)(Math.random()* (6-1+1)+1);
	System.out.println("You rolled a " + dice1);
	
	 dice1 = (int)(Math.random()* (6-1+1)+1);
	System.out.println("You rolled a " + dice1);
	
	 dice1 = (int)(Math.random()* (6-1+1)+1);
	System.out.println("You rolled a " + dice1);
	
	 dice1 = (int)(Math.random()* (6-1+1)+1);
	System.out.println("You rolled a " + dice1);
}
}
