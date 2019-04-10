package tesst;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailExample {
	final static String username = "toan.spro@gmail.com";
	final static String password = "spro@123";

	public static void main(String[] args) {
		String emailFrom = "toan.spro@gmail.com";
		String displayNameFrom = "Thang hoang";
		String emailTo = "thanghoang07@gmail.com";
		String subject = "Example Email";
		String body = "Text/HTML Content.";
		sendEMail(emailFrom, displayNameFrom, emailTo, subject, body);
	}

	public static void sendEMail(String from, String displayName, String to, String subject, String body) {
		String host = "smtp.gmail.com";
		int port = 587; // SMTP Server Port
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		Session mailSession = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		Message msg = new MimeMessage(mailSession);
		try {
			InternetAddress fromAddress = new InternetAddress(from, displayName);
			InternetAddress toAddress = new InternetAddress(to);
			msg.setFrom(fromAddress);
			msg.setRecipient(Message.RecipientType.TO, toAddress);
			msg.setSubject(subject);
			msg.setContent(body, "text/html; charset=utf-8");
			msg.setHeader("X-Mailer", "ZingMail");
			msg.setSentDate(new Date());
			msg.saveChanges();
			Transport.send(msg);
			System.out.println("Message sent OK.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
