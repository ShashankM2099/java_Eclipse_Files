package JavaFiles;

public class program15 {
	public static void main(String[] args) {
		// Swapping 2 vars
		int a, b, tempVar;
		a = 33;
		b = 66;
		System.out.println("Before swapping :Variables:= " + a + ", " + +b);
		tempVar = a;
		a = b;
		b = tempVar;
		System.out.println("After swapping : Variables:= " + a + ", " + +b);
	}
}
