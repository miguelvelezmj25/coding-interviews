// SRM 604 DIV 2

import java.util.*;

public class FoxAndWord {

	public int howManyPairs(String[] words) {
		Set<String> pairs = new HashSet<String>();
		int count = 0;

		for(int i = 0; i < words.length; i++) {
			String current = words[i];

			for(int j = 0; j < (current.length()-1); j++) {
				StringBuilder hold = new StringBuilder();
				hold.append(current.substring(j+1, current.length()));
				hold.append(current.substring(0, j+1));
				
				String newString = hold.toString();

				for(int k = 0; k < words.length; k++) {
					if(k != i && newString.equals(words[k]) &&
							!pairs.contains("" + k + "" + i) &&
							!pairs.contains("" + i + "" + k)) {
						count++;
						pairs.add("" + i + "" + k);	
					}
				}	
			}
		}

		return count;
	}

}
