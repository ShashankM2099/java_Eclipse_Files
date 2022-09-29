package JavaFiles;
import java.util.Scanner;
public class program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your numbers: ");
		for(int i=0;i<3;i++) {
			System.out.println("Enter your "+ (i+1)+ " number");
			 num = sc.nextDouble();
			 num/=3;
		}
		System.out.println("Average: " + num );
		sc.close();
	}

}
