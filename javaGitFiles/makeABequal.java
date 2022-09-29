package javaGitFiles;

import java.io.IOException;
import java.util.Scanner;

public class makeABequal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==B) {
				System.out.println("YES");
			}
			else {
				int C =0;
				int M = 0;
				if(A<B) { //A = 5, B = 20
					C=A;
					M = B;
				}
				else {
					C=B;
					M = A;
				}
				while(C<M) {
					C=2*C;
					if(C>M) {
						System.out.println("NO");
						break;
					}
					else if(C==M) {
						System.out.println("YES");
						break;
					}	
				}
			}
			
			
			T--;
		}
		//sc.close();
		
	}
}