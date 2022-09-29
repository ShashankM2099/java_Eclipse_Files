package dayEx2;
import java.util.*;
public class swapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first variables: ");
		int a = sc.nextInt();
		System.out.println("Enter your second variable: ");
		int b = sc.nextInt();
		System.out.println("Before swapping variables your 'a' is "+ a+ " your 'b' is "+ b);
		temp =a;
		a=b;
		b=temp;
		System.out.println("After swapping variables your 'a' is "+ a+ " your 'b' is "+ b);
		sc.close();
	}

}
