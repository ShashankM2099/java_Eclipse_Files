package javaGitFiles;

public class javaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operators
		int a = 10;
        int b = 20;
        int c;
        System.out.println (c = a); // Output =10
        System.out.println (b += a); // Output=30
        System.out.println (b -= a); // Output=20
        System.out.println (b *= a); // Output=200
        System.out.println (b /= a); // Output=2
        System.out.println (b %= a); // Output=0
        System.out.println (b ^= a); // Output=0
        System.out.println (a == b); // returns false because 10 is not equal to 20
        System.out.println (a != b); // returns true because 10 is not equal to 20
        System.out.println (a > b); // returns false 
        System.out.println (a < b); // returns true 
        System.out.println (a >= b); // returns false
        System.out.println (a <= b); // returns true
        System.out.println (a & b); //returns 8 = 1000
        System.out.println (a | b); //63=111111
        System.out.println (a ^ b); //55=11011
        System.out.println (~a); //-59

	}

}
