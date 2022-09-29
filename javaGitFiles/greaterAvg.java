package javaGitFiles;

import java.util.Scanner;

public class greaterAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t!=0) {
		        double a =sc.nextInt();
		        double b =sc.nextInt();
		        double c =sc.nextInt();
		        
		        double avg = (a+b)/2;
		        if(avg > c) {
		                System.out.println("Yes");
		        }else {
		                System.out.println("No");
		        }
		        t--;
		}

	}

}
