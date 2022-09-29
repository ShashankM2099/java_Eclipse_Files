/*
 * author: [Shashank Mondrati]
 * version @[ 3/21/2020]
 * Program: This program increments before and after the method call
 */
package LO6;

public class incrementJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1; // int value
		System.out.println("ID001");
		System.out.println(" Before the call, x is " + x);
		increment(x); // increment value
		System.out.println(" After the call, x is" + x);

	}

	public static void increment(int n) {
		n++; // post increment
		System.out.println(" n inside the method is " + n);
	}

}
