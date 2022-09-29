package javaGitFiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class saleSeason {

	public static void main(String[] args) throws Exception {
		
		//Take user input for num of iterations
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bufferedReader.readLine());
		
		
		while(T!=0) {
			int X = Integer.parseInt(bufferedReader.readLine()); // read input
			// X<100 no disc
			// 100 and 1000  25r
			// 1000 and 5000 100r
			// X>5000 500r
			
			//logic
			int discount = 0;
			if(X<=100) {
				discount = 0;
			}
			else if(X>100 && X<=1000) {
				discount =25;
			}
			else if(X>1000 && X<=5000) {
				discount = 100;
			}
			else if(X>5000) {
				discount = 500;	
			}
			
			// print output
			System.out.println(X - discount);
			T--; //decrement
		}
	}

}
