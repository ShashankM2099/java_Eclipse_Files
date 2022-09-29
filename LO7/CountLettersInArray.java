/*
 * author @[ Shashank Mondrati]
 * version @ [ 4/3/2020]
 * Program : Presents a a program to count the occurences of each letter in an array of characters
 */
package LO7;
import java.util.*;
public class CountLettersInArray {

	public static void main(String[] args) {
		    // Empty for now. Used in later questions
		int numbers[] = {3, 6, 77, 3, 10, 1, 4, 3};
		  int foundIndex = mysteryMethod(numbers, 6);
		  System.out.println(foundIndex);
		  }

		  public static int mysteryMethod(int[] a, int key){
		    int low = 0;
		    int high = a.length - 1;

		    while (high >= low) {
		      int mid = (low + high) / 2;
		      if (key < a[mid])
		        high = mid - 1;
		      else if (key == a[mid])
		        return mid;
		      else
		        low = mid + 1;
		    }

		    return -1;
		  }
	  }
// End of void displayCounts(int[])


