package javaGitFiles;

import java.util.Scanner;

public class airTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T!=0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if(A<=B && C<=B) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			T--;
		}
		
	}

}

//Pseudo
		/*
		 * Take user input
		 * Use while loop
		 * Store user inputs in A,B,C
		 * Alice wants atleast A degrees
		 * Bob wants most(greater than) B degrees
		 * Charlie wants (less than) C degrees
		 * the temperatures must be in ranges of A,B,C
		 * 
		 * A  = 30, C = 35 => 35
		 * A  = 30, C = 12 => 30
		 * A  = 40, C = 35 => 40
		 * 
		 *  
		 * initial Temparature => Alice + Charlie => max (Alice, Charlie) = max (A, C)
		 * 
		 * iT = 35, Bob = 38, [35, 36, 37, 38] - YES
		 * iT = 40, Bob = 35, [-] - NO
		 * iT = 20, Bob = 23, [20, 21,22, 23] - YES
		 */