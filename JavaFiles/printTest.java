package JavaFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class printTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\sudha\\RaleighWeather2010.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String st;
		
		try {
			while ((st = br.readLine()) != null) {
				// Print the string
				System.out.println(st);
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception");
		}
		

	}

}
