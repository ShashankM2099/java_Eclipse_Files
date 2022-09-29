package LearningJava;
import java.util.*;
public class staticClass {
	public static String name;
	public static String address;
	public static int zipCode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?: ");
		String answer = sc.nextLine();
		staticClass.name= answer;
		System.out.println("your name is: "+ staticClass.name);
		//staticClass.zipCode= 28262;
		sc.close();
	}

}
