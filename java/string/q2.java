// Write an efficient function that deletes characters from a string

import java.util.HashSet;
import java.util.Set;

public class q2 {
	
	public static void main(String[] args) {
		String s = "Battle of the Vowels: Hawaii vs. Grozny";

		System.out.println(deleteFromString(s, "aeiou"));
	}

	public static String deleteFromString(String source, String what) {
		// Hash the characters that we want to remove in a set
		Set<Character> charsToRemove = new HashSet<Character>();
	
		for(int i = 0; i < what.length(); i++) {
			charsToRemove.add(what.charAt(i));
		}

		StringBuilder result = new StringBuilder();
		char character = ' ';

		// Loop through the source string
		for(int i = 0; i < source.length(); i++) {
			// Get the current character
			character = source.charAt(i);
			
			// If the character is not in the set of chars to remove
			if(!charsToRemove.contains(character)) {
				result.append(character);
			} 
		}	

		return result.toString();	
	}
}
