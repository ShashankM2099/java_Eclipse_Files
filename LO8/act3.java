package LO8;
import java.util.*;
public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random x = new Random();
		int[]arr = new int [50];
		int min,max,minIndex,sum=0;
		arr[0] = x.nextInt(1000)+1;
		min = arr[0];
		max = arr[0];
		sum = arr[0];
		int abveAvg = 0;
		int belwAvg=0;
		minIndex=0;
		
		for (int i=1; i<50; i++) {
			arr[i] = x.nextInt(1000)+1;
			if(min>arr[i]) {
				min=arr[i];
				minIndex=i;
			}
			if(max<arr[i]) {
				max=arr[i];
			}
			sum=sum+arr[i];
		
			if(arr[i]>(float)sum/50) {
				abveAvg++;
			}
			if(arr[i]<(float)sum/50) {
				belwAvg++;
			}
		}

		System.out.println("Highest Element: " + max);
		System.out.println("Lowest Element: " + min);
		System.out.println("Lowest Element Index: " + minIndex);
		System.out.println("Average: " + (float)sum/50);
		System.out.println("Above Average: " + abveAvg );
		System.out.println("Below Average: " + belwAvg);
	
	}

}
