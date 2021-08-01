package projects.email;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainBulk {
	
	public static void main(String[] args) {
		
		BulkMailSender mailSender = new BulkMailSender();

		// to send mail to a single person
		//mailSender.startProcess("aakreety07@hotmail.com");
		
		// for sending to a set of people, we have to use looping
		// 1. we get all the email of the people
		Set<String> emails = get();
		
		// 2. we can use any type of looping
		for (String string : emails) {						// 2.a using enhanced for loop
			mailSender.startProcess(string);
		}
		
		
//		Iterator<String> iter= data.iterator();				// 2.b using iterator (better option)
//		while (iter.hasNext()) {
//			String toEmail = iter.next();
//			mailSender.startProcess(toEmail);
//		}
		
		
		
	}
	
	// returns a Set that contains all the emails
	private static Set<String> get() {

		Set<String> emails = new HashSet<>();
		
		emails.add("aakreety07@hotmail.com");
		emails.add("amyslax@hotmail.com");
		emails.add("aniliuk@hotmail.com");
		emails.add("anisha_shrestha2@hotmail.com");
		emails.add("asajeshani@hotmail.co.uk");
		emails.add("aslam1qqqq@gmail.com");			// my address
		emails.add("barunshrestha@hotmail.com");
		emails.add("beyounce_ranzita@hotmail.com");
		emails.add("bhimrajg@hotmail.com");
		emails.add("bijay_kc@hotmail.com");
		
		emails.add("bivek_shrestha@hotmail.com");
		emails.add("bloody_tears@live.com");
		emails.add("borderline_bipolar@btopenworld.com");
		emails.add("boyz_eitan@hotmail.com");
		emails.add("coolpurna@hotmail.com");
		emails.add("danger_don45@hotmail.com");
		emails.add("dcblmc_065823@hotmail.com");
		emails.add("debbierana@hotmail.com");
		emails.add("devasainju@msn.com");
		emails.add("devil_tanisha@hotmail.com");
		
		emails.add("hell_pursuit@hotmail.com");
		emails.add("hill_tiger2007@hotmail.com");
		emails.add("jadewyles@hotmail.co.uk");
		emails.add("jawad_drmc@yahoo.com");
		emails.add("jericho_kritisha_peterson@hotmail.com");
		emails.add("jhonradhae@hotmail.com");
		emails.add("k_pant@hotmail.com");
		emails.add("kanekanef_eminem@hotmail.com");
		emails.add("kc.ka@hotmail.com");
		emails.add("kg_luckycharm@hotmail.com");
		
		return emails;
	}
}