package javaGitFiles;

import java.util.Scanner;

public class weightMsmrnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int W = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			if (W == X + Y || W == Y + Z || W == X + Z || W == X + Y + Z) {
				System.out.println("YES");
			} else if (W == X || W == Y || W == Z)
				System.out.println("YES");
			else
				System.out.println("No");
			
			//T--;
		}
		sc.close();

	}

}
