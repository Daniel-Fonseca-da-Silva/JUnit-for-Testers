package vote;

import java.util.Calendar;

public class VoteAge {

	public static String canVote(String name, int birthday) {
		String result = null;
		int age = getYear() - birthday;
		if (age < 16) {
			result = name + " you can't vote";
		}
		if (age >= 16 && age <= 17 || age > 70) {
			result = name + " your vote is optional";
		}
		if (age >= 18 && age <= 70) {
			result = name + " your vote is mandatory";
		}
		return result;
	}
	
	private static int getYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}
}