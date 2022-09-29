package javaGitFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class maxSubmissions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0) {
			int X = sc.nextInt();
			System.out.println(2 * X);
			T--;
		}
	}

}
