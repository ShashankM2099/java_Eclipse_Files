package javaGitFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tvDiscount {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bufferedReader.readLine());
		while(T!=0){
		    String input = bufferedReader.readLine();
		    String [] inputs = input.split(" ");
		    int A = Integer.parseInt(inputs[0]);
		    int B = Integer.parseInt(inputs[1]);
		    int C = Integer.parseInt(inputs[2]);
		    int D = Integer.parseInt(inputs[3]);
		    
		    int first = A -C;
		    int second = B - D;
		    
		    if(first<second){
		       System.out.println("First");
		    }
		    else if (first > second){
		        System.out.println("Second");
		    }
		     else {
		         System.out.println("Any");
		     }
		    T--;
		}
	}

}
