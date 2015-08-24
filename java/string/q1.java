// Write and efficient function to find the first nonrepeated character in a string

import java.util.Map;
import java.util.HashMap;

public class q1 {
	
	public static void main(String[] args) {
		String s = "teeter";

		System.out.println(firstNonRepeated(s));
	}

	public static Character firstNonRepeated(String s) {
		Map<String, Integer> stringToCount = new HashMap<String, Integer>();
		
		// Loop through the string
		for(int i = 0; i < s.length(); i++) {
			// If the character has not been seen before
			if(stringToCount.get(s.charAt(i) + "")  == null) {
				stringToCount.put(s.charAt(i) + "", 1);
			}
			else {
				// Increment the count
				stringToCount.put(s.charAt(i) + "", stringToCount.get(s.charAt(i) + "") + 1);
			}		
		}	

		// Loop through the string to check the first non repeated character
		for(int i = 0; i < s.length(); i++) {
			// If we only saw this character once
			if(stringToCount.get(s.charAt(i) + "") == 1) {
				return s.charAt(i);
			}
		}
		
		// If we looped through the entire string and did not return,
		// there was not a non repeated character

		return null;
	}
}
