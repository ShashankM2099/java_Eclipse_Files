package LearningJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readFromUrl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://fakerapi.it/api/v1/persons?_quantity=100&_locale=en_US&_gender=female");
			
			HttpURLConnection hr = (HttpURLConnection) url.openConnection();
			System.out.println(hr.getResponseCode());
			if (hr.getResponseCode() == 200) {
				InputStream im = hr.getInputStream();
				StringBuffer sb = new StringBuffer();
				BufferedReader bf = new BufferedReader(new InputStreamReader(im));
				FileOutputStream fo = new FileOutputStream("finalGender.json");
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
				String line = bf.readLine();
				while (line != null) {
					//System.out.println(line);
					bw.write(line);
					bw.newLine();
					line = bf.readLine();
					//System.out.println("DONE");

				}
				System.out.println("FileCreatedSucessfully---");

			}

		} catch (Exception e) {

		}
//		Object obj = new JSONParser().parse(new FileReader("https://jsonplaceholder.typicode.com/photos"));
//		JSONObject json = (JSONObject) obj;
//		String albId = (String) json.get("url");
//		System.out.println(albId);

	}
}
