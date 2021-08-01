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

public class MailSender {

	private Session session;
	private Message message;
	
	private String fromEmail = "aslamhit21009@gmail.com";
	private String password = "hit21009";
	private String toEmail = "wasa.wasa.in@gmail.com";
	
	public void makeConnection(){
		
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

	public void createMessage() {
		
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

	public boolean send() {
		
		try {
			Transport.send(message);
			System.out.printf("MESSAGE SUCCESSFULLY SENT to <%s> !!!", toEmail);
			return true;
		} catch (MessagingException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		} 
	}
	
	private String getText() {

		String[] splittedArray= toEmail.split("@");
		String name = splittedArray[0];
		
		String message = "Dear Mr. " + name + ",\n"
				+ "\tGreetings to you. I hope you are at the best of your health. "
				+ "\nWelcome to my GitHub account - https://github.com/Aslam-web/EmailApplication"
				
				+ "\n\n\nThanks & Regards"
				+ "\nMr M.N Aslam,"
				+ "\nJAVA developer Trainer,"
				+ "\nHaaris Infotech Institutions,"
				+ "\nEmail : aslam1qqqq@gmail.com,"
				+ "\nPhone: +91 63799 71782.";
		
		return message;
	}

}














