/*
 * author @ [Shashank Mondrati]
 * version @ [3/21/2020]
 * Program ; This Program swaps the two numbers
 */
package LO6;

public class testPassByValue { // class name

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
// Declare and initialize variables
		int num1 = 1; // int n1
		int num2 = 2; // int n2
		System.out.println("ID002");
		System.out.println(" Before invoking the swap method, num1 is " +num1+ " num2 is " + num2);
		//invoking the swap method to attempt swap num1 and num2
		swap(num1, num2); // method callback
		System.out.println(" After invoking the swap method, num1 is " +num1 + " num2 is " +num2);
	}

	public static void swap(int n1, int n2) { // method name swap
		// TODO Auto-generated method stub
		System.out.println(" \t INside the swap method");
		System.out.println(" \t Before swapping n1 is  " +n1 + " n2 is " +n2) ;
		// Swap n1 and n2
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println(" \t After swapping, n1 is " +n1 + " n2 is " +n2);
	}

}
