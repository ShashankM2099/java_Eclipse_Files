package LearningJava;

import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class sendingToMailFromFile {

	public static void main(String[] args) throws IOException, ParseException, ClassCastException {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		String to = "sudhamshmondrati@gmail.com";
		String from = "dandiya14@gmail.com";
		Properties pr = System.getProperties();

		pr.put("mail.smtp.host", "smtp.gmail.com");
		pr.put("mail.smtp.starttls.enable", "true");
		pr.put("mail.smtp.auth", "true");
		pr.put("mail.smtp.port", "587");
		pr.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		pr.put("mail.smtp.ssl.protocols", "TLSv1.2");
		Session ss = Session.getInstance(pr, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(from, "Darkpaladin");
			}

		});
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("How many fields do you need?: ");
			int userChoice = sc.nextInt();
			// Object jsonS = parser.parse(new FileReader("finalGender.json"));
			JSONObject objS = (JSONObject) parser.parse(new FileReader("finalGender.json"));
			JSONArray dataArea = (JSONArray) objS.get("data");
			Iterator i = dataArea.iterator();
			int k = 0;
			String finsMess = "Hello, this is Shashank! You have requested information of "+ userChoice+ " number of fields\n";
			StringBuilder sb = new StringBuilder();
			sb.append(finsMess);
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
				String strNum = (String) addressArea.get("streetName");
				String builNum = (String) addressArea.get("buildingNumber");
				String city = (String) addressArea.get("city");
				String zCode = (String) addressArea.get("zipcode");
				String country = (String) addressArea.get("country");
				String country_code = (String) addressArea.get("country_code");
				double latitude = (double) addressArea.get("latitude");
				double longitude = (double) addressArea.get("longitude");
				String img = (String) field.get("image");
				sb.append("\nFirst Name: " + firstName + "\nLastName: " + lastName
						+ "\nEmail: "+ email
						+ "\nPhone: "+ phone
						+"\nBirthday: "+ birthday
						+"\nGender: "+ gender
						+"\nAddress: "+ address
						+"\nStreetNumber: "+ strNum
						+"\nBuildingNumber: "+ builNum
						+"\nCity: "+ city + "\n\n");
				k++;
				}

			MimeMessage msg = new MimeMessage(ss);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject("CodingFiles2");
			String finaMsg = finsMess;

			msg.setContent(sb.toString(), "text/plain; charset=UTF-8");
			Transport.send(msg);
			System.out.println("Email sent successfully.");
			System.out.println(sb.toString());

			sc.close();

		} catch (FileNotFoundException e) {
			System.out.println(e);

		} catch (IOException f) {
			System.out.println(f);

		} catch (NoSuchElementException g) {
			System.out.println(g);

		} catch (MessagingException h) {
			System.out.println(h);

		}

	}

}
