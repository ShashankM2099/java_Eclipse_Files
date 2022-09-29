package javaGitFiles;

public class trianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trianglePattern(5);

	}

	public static void trianglePattern(int rows) {
		/*
         * row = 1
        * * row = 2
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *

*/
		//outer loop
		for (int i = 1; i <= rows; i++) {

			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
