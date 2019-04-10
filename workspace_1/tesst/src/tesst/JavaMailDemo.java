package tesst;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailDemo {
	public static void main(String[] args) {
		try {
			// Authenticated and send mail
			Properties props = System.getProperties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			props.put("mail.transport.protocol", "smtp");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.auth", "true");
			props.put("mail.debug", "true");

			Authenticator auth;
			auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("toan.spro@gmail.com", "spro@123");
				}
			};

			Session session = Session.getInstance(props, auth);
			Message msg = new MimeMessage(session);

			msg.setFrom(new InternetAddress("toan.spro@gmail.com"));
			msg.setSubject("Java mail demo");
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress("thanghoang07@gmail.com"));
			msg.setContent("<h1>Hello ! How are you ?</h1>", "text/html");

			Transport.send(msg);
		
		} catch (Exception ex) {
			System.out.print(ex.toString());
		}
	}
}
