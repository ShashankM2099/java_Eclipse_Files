package dayEx1;

import java.util.*;

public class secondLargestIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr1[] = { 35, 399, 999, 27, 7, 10000, 9000, 2, 3, 4, 5, 1 };
		System.out.println("Second largest in an Array is: " + secondLargest(arr1, arr1.length));
	}

	public static int secondLargest(Integer[] arr1, int total) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(arr1);
		Collections.sort(list);
		int element = list.get(total - 2);

		return element;

//		Arrays.sort(arr1); // sort method sorts them low to high
//
//		return arr1[total - 2];// total -1 returns the first highest
	}

}
