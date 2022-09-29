package javaGitFiles;

public class postIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// post increment
		//problem 1
		int x = 44;
		 int y = (x++)+445;
		 //Post will store the x value in y and do the remaining ops and then increase the value by 1.
		 System.out.println(y);
		// use variable first then increment
		 
		 //problem 2
		int a = 10;
		int xy = 5 * a++;
		// first multiply 5 times 10 and increase a by one
		// x = 5 * 10 = 50, and a = 11
		System.out.println(xy + "= x" + ", and "+ a + "=a");
		
		//problem 3
		int fv = 55;
		int fb = 10 + (fv++) + (++fv); // mid var is post var
		System.out.println(fv);
		System.out.println("FV is "+ fv +" Fb is "+ fb);
		
		//problem 4
		int f = 12;
		int g = 8 + f--;
		System.out.println(f + " is f, and g is "+ g);
	}

}
