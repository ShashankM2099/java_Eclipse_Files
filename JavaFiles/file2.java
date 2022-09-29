package JavaFiles;

import java.util.Scanner;

public class file2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input 5 numbers from user and add them and finf avg
		Scanner sc = new Scanner(System.in);
		System.out.println("Input numbers size: ");
		int numL = sc.nextInt();
		int numEntered =0;
		int sum=0;
		int average =0;
		
		for(int i=0;i<numL;i++) {
			System.out.println("Enter the " + i+ " number");
			 numEntered = sc.nextInt();
			 sum+=numEntered;
			 average =sum/numEntered;
		}
		System.out.println("Sum: "+ sum);
		System.out.println("Average: "+ average);

	}

}
