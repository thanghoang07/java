package modul;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SentMail {
	// body mail
	private static String bodyMail(String name, String email, String body2) throws UnsupportedEncodingException {

		String link = "http://www.facebook.com/thanghoang07";
		String body = "YÊU CẦU CỦA PHỤ HUYNH :\n";
		Date today = new Date();
		DateFormat time = new SimpleDateFormat("hh:mm:ss");
		String stringDate = time.format(today);
		body += "\n- - - - - - - - - - - - - - - - - - - - -\n* Yêu cầu của khách hàng và nhận yêu cầu lỗi"
				+ " \n* Tên : " + name + "\n* Email: " + email + "\n* Nội dung : " + body2
				+ "\n- - - - - - - - - - - - - - - - - - - - -\n* Time: " + stringDate
				+ "\n- - - - - - - - - - - - - - - - - - - - -\n* Truy cập trang ngay: " + link;

		System.out.println(body);
		return body;
	}

	// body mail
	private static String bodyMail2(String name, String email) throws UnsupportedEncodingException {

		String link = "http://www.facebook.com/thanghoang07";
		String body = "SEVEN TOUR :\n";
		String body3 = "Chúng tôi sẽ phản hồi lại cho bạn sớm nhất có thể về yêu cầu của bạn";
		Date today = new Date();
		DateFormat time = new SimpleDateFormat("hh:mm:ss");
		String stringDate = time.format(today);
		body += "\n- - - - - - - - - - - - - - - - - - - - -\n* Cảm ơn bạn đã gửi thư cho chúng tôi" + " \n* Tên : "
				+ name + "\n* Email: " + email + "\n* Nội dung : " + body3
				+ "\n- - - - - - - - - - - - - - - - - - - - -\n* Time: " + stringDate
				+ "\n- - - - - - - - - - - - - - - - - - - - -\n* Truy cập trang ngay: " + link;

		System.out.println(body);
		return body;
	}

	// phuong thuc gui mail
	private static void sentMail(String to, String body, String subject) throws Exception {
		String smtpServer = "smtp.gmail.com";
		String from = "thanghoang07@gmail.com";
		String password = "gdgswgkoulzcxolq";
		Properties props = System.getProperties();
		props.put("mail.smtp.host", smtpServer);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		final String login = from;
		final String pwd = password;
		Authenticator pa = null;
		if (login != null && pwd != null) {
			props.put("mail.smtp.auth", "true");
			pa = new Authenticator() {

				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(login, pwd);
				}
			};
		} // else: no authentication
		Session session = Session.getInstance(props, pa);
		// — Create a new message –
		Message msg = new MimeMessage(session);
		// — Set the FROM and TO fields –
		msg.setFrom(new InternetAddress(from));
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));

		// — Set the subject and body text –
		msg.setSubject(subject);
		msg.setText(body);
		// — Set some other header information –
		msg.setHeader("X-Mailer", "LOTONtechEmail");
		msg.setSentDate(new Date());
		msg.saveChanges();
		// — Send the message –
		Transport.send(msg);
	}
}
