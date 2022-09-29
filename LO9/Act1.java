package LO9;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArray = new int[4][5]; // 4 rows and 5 columns for a 2-d array

		// use a nested for loop to make a matrix of 4x5 and fill them with random #'s
		for (int i = 0; i < 4; i++) { // for rows
			for (int j = 0; j < 5; j++) { // for columns
				myArray[i][j] = (int) (Math.random() * 10); // filling them with randoms
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(myArray[i][j] + " ");//sysout
			}
			System.out.println();
		}
	}
}
