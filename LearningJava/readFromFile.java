package LearningJava;

import java.io.*;
import java.util.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class readFromFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException, ClassCastException {
		// TODO Auto-generated method stub

		JSONParser parser = new JSONParser();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("How many fields do you need?: ");
			int userChoice = sc.nextInt();
			// Object jsonS = parser.parse(new FileReader("finalGender.json"));
			JSONObject objS = (JSONObject) parser.parse(new FileReader("finalGender.json"));
			JSONArray dataArea = (JSONArray) objS.get("data");
			Iterator i = dataArea.iterator();
			int k = 0;
			String finMes = "";
			while (k < userChoice) {
				JSONObject field = (JSONObject) i.next();
				String firstName = (String) field.get("firstname");
				String lastName = (String) field.get("lastname");
				String email = (String) field.get("email");
				String phone = (String) field.get("phone");
				String birthday = (String) field.get("birthday");
				String gender = (String) field.get("gender");
				// to get field in the address field use addressArea obj
				String website = (String) field.get("website");
				JSONObject addressArea = (JSONObject) field.get("address");
				String address = (String) addressArea.get("street");
				String strNum = (String)addressArea.get("streetName");
				String builNum = (String)addressArea.get("buidlingNumber");
				String city = (String)addressArea.get("city");
				String zCode = (String)addressArea.get("zipcode");
				String country = (String)addressArea.get("country");
				String country_code = (String)addressArea.get("country_code");
				double latitude = (double)addressArea.get("latitude");
				double longitude = (double)addressArea.get("longitude");
				String img = (String)field.get("image");
				
				
				// System.out.println(addressArea.get("street"));

				System.out.println("firstName: " + firstName);
				System.out.println("LastName: " + lastName);
				System.out.println("email: " + email);
				System.out.println("phoneNumber: " + phone);
				System.out.println("birthday: " + birthday);
				System.out.println("Gender: " + gender);
				System.out.println("Address: " + address);
				System.out.println("Street: " + strNum);
				System.out.println("BuildingNum: " + builNum);
				System.out.println("City: " + city);
				System.out.println("ZipCode: " + zCode);
				System.out.println("Country: " + country);
				System.out.println("Country_Code: " + country_code);
				System.out.println("Latitude: " + latitude);
				System.out.println("Longitude: " + longitude);
				System.out.println("Website: " + website);
				System.out.println("Image: " + img);
				System.out.println("-------------------------------------------");
				finMes.concat("First Name: ");
				finMes.concat(firstName);
				k++;
				
			}
			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} catch (NoSuchElementException f) {
			System.out.println("OutOfElements");

		}

	}

}
