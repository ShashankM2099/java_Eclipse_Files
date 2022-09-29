package dayEx2;
//import java.math.*;
import java.util.*;
public class areaPerimeterCircke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculating the Area of a Circle ");
		System.out.println("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		double area = Math.PI* Math.pow(radius, 2);
		System.out.println("Area of the circle is: "+ area +" cms.");
		System.out.println("Calculating Perimeter or Circumference of a cirlce ");
		double circumeference = 2* Math.PI* area;
		System.out.println("Circumference of a cirlce is: "+ circumeference+ " cms.");
		sc.close();
		
	}

}
