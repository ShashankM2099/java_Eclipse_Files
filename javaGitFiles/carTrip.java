package javaGitFiles;

import java.util.Scanner;

public class carTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program 1
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0) {
			int X = sc.nextInt();
			if(X>=300) {
				System.out.println(X*10);
			}
			else {
				System.out.println(3000);
			}
			T--;
		}
	}

}
