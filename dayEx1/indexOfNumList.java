package dayEx1;

import java.util.*;

public class indexOfNumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a method that returns the index of the first occurrence of given
		// integer in a list
		// What does it mean?
		// Return the index of the first number integer in a ArrayList
		Scanner sc = new Scanner(System.in);
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(24);
		a1.add(2);
		a1.add(66);
		a1.add(55);
		a1.add(44);
		a1.add(889);
		a1.add(123);
		a1.add(345);
		a1.add(678890);
		while (true) {
			System.out.println(" What do you wish to your list: \n Enter 'add' to add or 'quit' to add");
			String add = sc.nextLine();
			if (add.equals("add")) {
				System.out.println("Add numbers to your list: ");
				int addNum = sc.nextInt();
				a1.add(addNum);

			} else if (add.equals("quit")) {
				System.out.println("Quitting");
				break;

			}

		}
		System.out.println("What index are you looking for: ");
		int index = sc.nextInt();
		System.out.println(a1.indexOf(index));
		sc.close();
		System.out.println("List Size is: " + a1.size());
	}

}
