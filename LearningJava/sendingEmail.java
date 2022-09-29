package LearningJava;

//import java.net.ConnectException;
import java.util.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import javax.activation.*;
//import javax.mail.Authenticator;

public class sendingEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String to = "sudhamshmondrati@gmail.com";
		String from = "dandiya14@gmail.com";
		Properties pr = System.getProperties();
		
		pr.put("mail.smtp.host", "smtp.gmail.com");
		pr.put("mail.smtp.starttls.enable", "true");
		pr.put("mail.smtp.auth", "true");
		pr.put("mail.smtp.port","587");
		pr.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		pr.put("mail.smtp.ssl.protocols", "TLSv1.2");
		Session ss = Session.getInstance(pr, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(from, "password");
			}

		});

		// ss.setDebug(true);
		try {
			MimeMessage msg = new MimeMessage(ss);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject("TestSubjekt");
			msg.setText("TestTrial1");
			Transport.send(msg);
			System.out.println("SentEmailSuccesfully");

		} catch (MessagingException mex) {
			System.out.println("Something Went Wrong");
			System.out.println(mex);

		}

	}

}
