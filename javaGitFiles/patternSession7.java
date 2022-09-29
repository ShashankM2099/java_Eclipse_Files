package javaGitFiles;

public class patternSession7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	 1 * 2 * 3 * 4 * 5
		 	* 2 * 3 * 4 * 5 *
			3 * 4 * 5 * 6 * 7
		 	* 4 * 5 * 6 * 7 *
			5 * 6 * 7 * 8 * 9
		 	* 6 * 7 * 8 * 9 *
			7 * 8 * 9 * 10 * 11
		 */
		int num =1;
		int max = 7;
		for(int i=0;i<=7;i++) {
			System.out.println();
			for(int j=1;j<=max;j++) {
				System.out.print(num +"*");
			}
			num=i+1;
			max++;
		}
	}

}
