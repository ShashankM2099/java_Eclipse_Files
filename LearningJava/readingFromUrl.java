package LearningJava;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class readingFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first do a try catch
		try {
			URL url = new URL("https://fakerapi.it/api/v1/persons?_quantity=100&_locale=en_US&_gender=female");

			HttpURLConnection hr = (HttpURLConnection) url.openConnection();
			if (hr.getResponseCode() == 200) {
				InputStream im = hr.getInputStream();
				StringBuffer sb = new StringBuffer();
				BufferedReader br = new BufferedReader(new InputStreamReader(im));
				String line = br.readLine();
				while(line!=null) {
					System.out.println(line);
					line = br.readLine();
					
				}
				
			}

		} catch (Exception e) {

		}
	}

}
