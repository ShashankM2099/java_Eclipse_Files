package javaGitFiles;

public class preIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 44;
		 int y = (++x)+445;
		 //PreIncrement will increase the value by one and do the operations next
		 System.out.println(y);
		 
		 // problem 2
		 int b = 2;
		 int c = 5 + ++b;
		 // first b =+1 and remaining ops
		 System.out.println(c);
		 
		 //problem 3
		 int f = 55;
		 int g = 1100+ (--f) + (f--);
		 System.out.println(f + " is f, and g is "+ g);
		 
		 //problem 4
		 int h  =45;
		 int j = 11/(--h);
		 System.out.println(h + " is H, and J is "+ j);
	}

}
