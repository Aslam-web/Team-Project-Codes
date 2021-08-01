package projects.email;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainBulk {
	
	public static void main(String[] args) {
		
		BulkMailSender mailSender = new BulkMailSender();

		// to send mail to a single person
		//mailSender.startProcess("recipient1@gmail.com");
		
		// for sending to a set of people, we have to use looping
		// 1. we get the set of people
		Set<String> data = get();
		
		// 2. we can use any type of looping
		for (String string : data) {						// 2.a using enhanced for loop
			mailSender.startProcess(string);
		}
		
		
//		Iterator<String> iter= data.iterator();				// 2.b using iterator (better option)
//		while (iter.hasNext()) {
//			String toEmail = iter.next();
//			mailSender.startProcess(toEmail);
//		}
		
		
		
	}
	
	
	private static Set<String> get() {

		Set<String> DATA = new HashSet<>();
		
		DATA.add("aakreety07@hotmail.com");
		DATA.add("amyslax@hotmail.com");
		DATA.add("aniliuk@hotmail.com");
		DATA.add("anisha_shrestha2@hotmail.com");
		DATA.add("asajeshani@hotmail.co.uk");
		DATA.add("aslam1qqqq@gmail.com");			// my address
		DATA.add("barunshrestha@hotmail.com");
		DATA.add("beyounce_ranzita@hotmail.com");
		DATA.add("bhimrajg@hotmail.com");
		DATA.add("bijay_kc@hotmail.com");
		
		DATA.add("bivek_shrestha@hotmail.com");
		DATA.add("bloody_tears@live.com");
		DATA.add("borderline_bipolar@btopenworld.com");
		DATA.add("boyz_eitan@hotmail.com");
		DATA.add("coolpurna@hotmail.com");
		DATA.add("danger_don45@hotmail.com");
		DATA.add("dcblmc_065823@hotmail.com");
		DATA.add("debbierana@hotmail.com");
		DATA.add("devasainju@msn.com");
		DATA.add("devil_tanisha@hotmail.com");
		
		DATA.add("hell_pursuit@hotmail.com");
		DATA.add("hill_tiger2007@hotmail.com");
		DATA.add("jadewyles@hotmail.co.uk");
		DATA.add("jawad_drmc@yahoo.com");
		DATA.add("jericho_kritisha_peterson@hotmail.com");
		DATA.add("jhonradhae@hotmail.com");
		DATA.add("k_pant@hotmail.com");
		DATA.add("kanekanef_eminem@hotmail.com");
		DATA.add("kc.ka@hotmail.com");
		DATA.add("kg_luckycharm@hotmail.com");
		
		return DATA;
	}
}