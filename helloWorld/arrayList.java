package helloWorld;
import java.util.Arrays;
import java.util.Scanner;
public class arrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while(true) {
			Scanner ind = new Scanner (System.in);
			System.out.println("Enter your string, if you want to stop, please type exit");
			String name = ind.nextLine();
			if (name.equals("exit")) {
				System.out.println("GoodBYe");
				break;
			} else {
				Character[] characters = new Character[name.length()];
				for(int i = 0;i<name.length();i++) {
					characters[i] = name.charAt(i);
				}
				System.out.println(Arrays.toString(characters));
			}
		}
		
	}

}
