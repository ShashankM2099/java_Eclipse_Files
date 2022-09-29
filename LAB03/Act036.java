package LAB03;

public class Act036 {
	public static void main(String[] args) {
		int a, b, c;
		a = 5;
		b = 4;
		c = -10;
		if (!(a > b++)) {
			System.out.println("Value of a is: " + a);
			System.out.println("We are inside the if-statement!");
			System.out.println("Value of b is: " + b);
		}
		if (c % 2 != 0 && c < 0) {
			c = c / 0;
			System.out.println("We are now in the else section and c is a negative odd number!" + c);
		} else
			System.out.println("c is even?");

		System.out.println("We are now back outside the if-statement!");

	}
}