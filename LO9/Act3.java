package LO9;

import java.util.*;

public class Act3 {

	public static int above(int[][] x, int point) { // TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int pointAbove = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (x[i][j] > point) {
					pointAbove++;
				}
			}
		}
		return pointAbove;
	}

	public static void main(String[] args) {
		int[][] arr = new int[5][6];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = (int) (Math.random() * 1000) + 1;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		Random x = new Random();
		int[] arr1 = new int[50];
		int min, max, minIndex, sum = 0;
		arr1[0] = x.nextInt(1000) + 1;
		min = arr1[0];
		max = arr1[0];
		sum = arr1[0];
		int aboveAvg = 0;
		int belowAvg = 0;
		minIndex = 0;

		for (int i = 1; i < 50; i++) {
			arr1[i] = x.nextInt(1000) + 1;
			if (min > arr1[i]) {
				min = arr1[i];
				minIndex = i;
			}
			if (max < arr1[i]) {
				max = arr1[i];
			}
			sum = sum + arr1[i];

			if (arr1[i] > (float) sum / 50) {
				aboveAvg++;
			}
			if (arr1[i] < (float) sum / 50) {
				belowAvg++;
			}
		}
		System.out.println("Highest number: " + max);
		System.out.println("Lowest number: " + min);
		System.out.println("Average: " + sum / 50);
		Scanner input = new Scanner(System.in);
		int point = input.nextInt();
		System.out.println("Number of values above " + point + " is " + above(arr, point));
	}

}
