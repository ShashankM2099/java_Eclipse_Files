package javaGitFiles;

import java.util.Scanner;

public class testAverages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if((A+B)/2 >=35 && (B+C)/2>=35 && (C+A)/2>=35) {
				System.out.println("Pass");
			}
			else System.out.println("Fail");
			T--;
		}
		
	}

}
