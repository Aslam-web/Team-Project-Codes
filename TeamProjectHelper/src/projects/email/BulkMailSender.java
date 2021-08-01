package projects.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class BulkMailSender {
	private Session session;
	private Message message;

	private String fromEmail = "sendersEmail@gmail.com";
	private String password = "sendersPassword";
	private String toEmail;

	
	// instead of calling all methods seperately, just calling this method is enough
	// this method will initialize the toEmail. and call all the corresponding methods
	public void startProcess(String toEmail) {
		this.toEmail = toEmail;
		makeConnection();
		createMessage();
		send();
	}
	

	// sets up the connection with sever and creates a Session
	private void makeConnection() {

		Properties properties = new Properties();

		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		// runs in another thread
		session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				System.out.println("connecting to server ... ");
				return new PasswordAuthentication(fromEmail, password);
			}
		});
	}

	
	// creates the Message object to be sent via mail
	private void createMessage() {

		message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Demostration of Email sending via JAVA program");
			message.setText(getText());

		} catch (Exception e) {
			System.out.println("SOME ERROR OCCURED !!!");
			e.printStackTrace();
		}
	}

	
	// sends the message using Transport.send()
	private boolean send() {

		try {
			Transport.send(message);
			System.out.printf("MESSAGE SUCCESSFULLY SENT to <%s> !!!\n", toEmail);
			return true;
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	
	// a helper method for createMessage() for creating the text body
	private String getText() {

		// splits the email so that we get the person's name
		String[] splittedArray = toEmail.split("@");
		String name = splittedArray[0];

		String message = "Dear Mr. " + name + ",\n" + "\tGreetings to you. I hope you are at the best of your health. "
				+ "\nWelcome to my GitHub account - https://github.com/Aslam-web/EmailApplication"

				+ "\n\n\nThanks & Regards" + "\nMr M.N Aslam," + "\nJAVA developer Trainer,"
				+ "\nHaaris Infotech Institutions," + "\nEmail : aslam1qqqq@gmail.com," + "\nPhone: +91 63799 71782.";

		return message;
	}
}