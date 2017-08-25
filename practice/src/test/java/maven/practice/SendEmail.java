package maven.practice;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {

		System.out.println("Starting test");
sendMail();

System.out.println("Test End");

	}

	public static void sendMail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("ishanmittal120@gmail.com", "Gmail@1506"));
		email.setSSLOnConnect(true);
		email.setFrom("ishan@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is 2nd test mail ... :-)");
		email.addTo("ish.mittal120@gmail.com");
		email.send();
	}

}
