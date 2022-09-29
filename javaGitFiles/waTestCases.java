package javaGitFiles;

import java.util.Scanner;

public class waTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		for(int i=0;i<T;i++){
		    int N= sc.nextInt();
		    int S[]=new int [N];
		    for(int j=0;j<N;j++){
		        S[j]=sc.nextInt();
		    }
		    String V=sc.next();
		    int min=100;
		for(int k=0;k<N;k++){
		    	if(V.charAt(k)=='0'){
		    		min=Math.min(S[k],min);
		    	}
		    }
		    System.out.println(min);
		    
		}

	}

}
