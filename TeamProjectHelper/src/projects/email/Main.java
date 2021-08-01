package projects.email;

public class Main {

	public static void main(String[] args) {
		
		MailSender mailSender = new MailSender();
		mailSender.makeConnection();
		mailSender.createMessage();
		mailSender.send();
	}
}