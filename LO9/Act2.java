package LO9;
import java.util.*;
public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the rows: ");
		int rows = input.nextInt();
		System.out.println("Enter the columns: ");
		int columns = (input.nextInt()+1);
		
		int [][] table = new int [rows][columns];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				table[i][j]=(i*j);
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
			System.out.print(table[i][j] + " ");
			}
		
			System.out.println();
		}
		
		 


	}

}
