package javaGitFiles;

import java.util.Scanner;

public class equalingNumbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if((A-B)%2==0) {
				System.out.println("YES");
			}
			else 
				System.out.println("NO");
			T--;
		}
		sc.close();

	}	

}
