package javaGitFiles;

import java.util.Scanner;

public class ageLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int A = sc.nextInt();
			if(A>=X && A<Y) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
				
			}
			T--;
		}

	}

}
