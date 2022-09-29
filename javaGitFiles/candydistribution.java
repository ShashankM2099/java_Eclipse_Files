package javaGitFiles;

import java.util.Scanner;

public class candydistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T --> 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			// if a/b ==0 or even shud print yes
			if (((N % M) == 0) && ((N / M) % 2 == 0) && M<=1000 && N>=1) {

				System.out.println(N / M);
				System.out.println("YES");

			} else
				System.out.println("No");

			//T--;

		}
		sc.close();

	}

}
