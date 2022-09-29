package javaGitFiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class populationClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bufferedReader.readLine()); // reading test cases
		
		while(T!=0) {
			String input = bufferedReader.readLine(); // string input
			String [] inputs = input.split(" ");
			int X = Integer.parseInt(inputs[0]);
			int Y = Integer.parseInt(inputs[1]);
			int Z = Integer.parseInt(inputs[2]);
			
			int out = (X-Y)+ Z;
			System.out.print("\n"+out);
			
			T--;
		}

	}

}
