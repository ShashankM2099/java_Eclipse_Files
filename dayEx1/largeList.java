package dayEx1;

import java.util.*;

public class largeList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Integer numOne[] = {3, 12, 4, 56, 777777, 88, 2002, 8888};
		System.out.println("Largest in the array is: " + findLargest(numOne, numOne.length));

	}

	public static int findLargest(Integer[]numOne, int i) 
	{
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(numOne);
		Collections.sort(list);
		int finEl = list.get(i - 1);
		return finEl;
	}

}
