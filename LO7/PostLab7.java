/*
 * author @ [ Shashank Mondrati]
 * version @ [ 3/29/2020]
 * Program: This program calculates the area of polygon based on the users number of sides given
 * and user-given side length.
 */
package LO7;

import java.util.Scanner; // imported scanner

public class PostLab7 { // class name
	static Scanner scan = new Scanner(System.in); // scanner scan

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub

		int n = 0; // numSides set to 0
		double s = 0; // sideLen set to 0

		area(n, s); // method call back

	}

	public static double area(int n, double s) { // method area
		// TODO Auto-generated method stub
		System.out.println(" ID001");
		System.out.println(" Enter the polygon's number of sides");
		n = scan.nextInt();
		System.out.println(" Enter the polygons side length: ");
		s = scan.nextDouble();
		double area1 = Math.pow(s, 2) * n; // top part of the formula
		double area2 = (1) / (4 * Math.tan((Math.PI) / n)); // bottom part of the formula
																	// math.tan funtion and Mat.pi
		double finalArea = area1 * area2; // multiplying them
		System.out.println(" The area of the polygon is: " + finalArea);
		return finalArea;

	}

}
