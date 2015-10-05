// SRM 605 DIV 2 250

import java.util.Set;
import java.util.HashSet;

public class AlienAndPassword {

	public int getNumber(String S) {
		Set<String> passwords = new HashSet<String>();

		for(int i = 0; i < S.length(); i++) {
			StringBuilder hold = new StringBuilder();
			hold.append(S.substring(0, i));

			if((i+1) < S.length()) {
				hold.append(S.substring(i+1, S.length()));
			}

			passwords.add(hold.toString());
		}

		return passwords.size();
	}
}
