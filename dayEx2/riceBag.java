package dayEx2;

import java.util.*;

public class riceBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Rice bag challenge
		// you have a given number of small rice bags (1 kilo each) and big rice bags (5
		// kilos each),
		// write a method that returns true if it is possible to make a package with
		// goal kilos of rice.
		System.out.println("Enter the big rice bag lbs: ");
		int bigPack = sc.nextInt();
		System.out.println("Enter the samll rice bag lbs: ");
		int smallPack = sc.nextInt();
		System.out.println("Enter the goal for the rice Bag: ");
		int goalPack = sc.nextInt();
		System.out.println("Rice bag " + packGoal(bigPack, smallPack, goalPack));
		sc.close();
	}

	public static boolean packGoal(int bigPack, int smallPack, int goalPack) {
		// TODO Auto-generated method stub
		boolean result = false;
		if (bigPack * 5 >= goalPack) {
			if (smallPack >= goalPack % 5)
				result = true;
		} else {
			if (smallPack >= goalPack - bigPack * 5) {
				result = true;
			}
		}
		return result;
	}
	

}
