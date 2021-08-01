package projects.email;

public class Main {

	public static void main(String[] args) {
		
		// crates MailSender object, to call all the methods
		MailSender mailSender = new MailSender();
		
		// make connection
		mailSender.makeConnection();
		// create message
		mailSender.createMessage();
		// send message
		mailSender.send();
	}
}