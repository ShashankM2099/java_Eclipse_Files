package LO8;
import java.util.*;
public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 int[] anArray;	        // declare an array of integers

	        anArray = new int[10];	// create an array of integers

	        // assign a value to each array element and print 
	        for (int i = 0; i < anArray.length; i++) {
	            System.out.println(" Enter a number for your integers");
	            int number = scan.nextInt();
	            anArray[i] = number;
	        }
	        
	        while(true) {
	        	System.out.println("Enter the index");
	        	int index = scan.nextInt();
	        	 if(index==-1) {
			        	System.out.println("Exit");
			        	break;
			        }
	        	 if(index<10) {
	        		 System.out.println("Number at index "+ index + " is " +anArray[index]);
	        	 } else {
	        		System.out.println("Number is not found ");
	        	} 
		       
	        }
	        
	        
	}

}
