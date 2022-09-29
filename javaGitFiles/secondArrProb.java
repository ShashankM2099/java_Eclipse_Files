package javaGitFiles;

import java.util.Scanner;

public class secondArrProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int size = sc.nextInt();
			int[] cases = new int[size];
			int count = 0;
			
			for (int j = 0; j < size; j++) {
				cases[j] = sc.nextInt();
//				System.out.println(cases[i]);
				if (cases[j] >= 1000) {
					count++;
				}

			}
			System.out.println(count);

		}

	}
	
	void pattern_2() {
	    for (int i=1;i <= 4; i++) {
	        int end = 4;
	        for (int j = 1; j <= end; j++) {
	            //print(j);
	            //print(" ");
	        }
	        //println()
	    }
	}

}

