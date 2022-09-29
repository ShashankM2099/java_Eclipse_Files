package LO8;
import java.util.*;
public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		System.out.println(" Enter the range of your Array: ");
		int range = scan.nextInt();
		Integer[] inputs = new Integer[range];	
		for(int i=0;i<range;i++) {
			int randomArrays = (int) (Math.random()* (range -1 +1)*(1));
			 inputs[i] = randomArrays;	
		}
		
		System.out.println(" Heres your range " + range);
		
		//comment below
		for(int i=0;i<range;i++) {
			System.out.print(inputs[i] +", ");
		}
		//
		
		System.out.println(" \n Enter a number to find its Index");
		int number = scan.nextInt();
		
		boolean numberFound = false;
		for(int j=0;j<inputs.length;j++) {
			if(number == inputs[j]) {
				numberFound = true;
				System.out.println("Number Found at "+j);
				break;
			} 
		}
		if(!numberFound) {
			System.out.println("NUmber not found");
		}
	}
}


