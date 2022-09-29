package dayEx1;
import java.util.*;
public class nthOddN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Returning nthOdd element in a list....if it's in the list..shud return the list's index
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Int valued number: ");
		int userNum = sc.nextInt();
		System.out.println("your number for nthOdd Number is at : "+ nthOddNa(userNum));
		sc.close();
	}

	public static int nthOddNa(int userNum) {
		// TODO Auto-generated method stub
		if(userNum<=0) {
			return -1;
			
		}
		
		return (2*userNum-1); // formula for nth Odd number is (2n-1)
	}

}
