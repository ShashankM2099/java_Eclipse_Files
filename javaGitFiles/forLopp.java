package javaGitFiles;

public class forLopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// O(n^2)
		int rows = 5;
		for (int i = 0; i <= rows; i++) { // outer loop runs 5 times
			// creates 5 new lines

			// puts what the lines are made of
			// j=1, j<=2
			// when j=1, j++, so second line is 2 for first condition
			// 1<=2, and 2==2 (for sec condition) so 2, 2
			// when j =3, j++, so third line i<=3, j++, so 3 3 3
			
			for (int j = 1; j <= i; j++) { // inner loop prints i rows with the same num
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		// prints
		// 1 22 333 4444 5555
		// if i=1, and j=1 print 1

		for (int i = 5; i >= 1; i--) { // loop1 prints 5->1 thats it
			int end = i;
			System.out.println();
			for (int j = 1; j <= end; j++) { // loop2
				System.out.print(j);
				System.out.print(" ");
			}

		}
		
		System.out.println("------------");
		  for(int k=5; k>=1; k--)
		  {
		   for(int l=k; l<=5; l++)
		    System.out.print(l);
		   System.out.println();
		  }
	}

}
