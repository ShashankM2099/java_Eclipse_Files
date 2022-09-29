package LearningJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class getJSON_Files {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JSONObject obj = (JSONObject) new JSONParser()
				.parse(new FileReader("C:\\Users\\sudha\\eclipse-workspace\\MyFirstExample\\finalGender.json"));

		JSONObject json = (JSONObject) obj;
		json.toJSONString();

		String status = (String) json.get("status");
		long code = (long) json.get("code");
		long total = (long) json.get("total");
		String firstName = (String)json.get("firstname");
		System.out.println("{");
		System.out.println("status: " + status);
		System.out.println("code: " + code);
		System.out.println("total: " + total);
		System.out.println("firstName: "+ firstName.substring(0, 5));

		System.out.println("}");

	}

}
