package helloWorld;

public class RandomNumbers {
	public static void main(String[] args) {
		int max, min;
		max = 10;
		min = 1;
		int x = (int) (Math.random() * (max - min + 1) + min);
		int random = (int) (Math.random() * (max - min + 1) + min);

		System.out.println("Random value in int from " + min + " to " + max + ":");

		System.out.println(random);
	}
}
