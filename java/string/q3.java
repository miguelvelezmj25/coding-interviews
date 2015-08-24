// Reverse the order of the words in a string

public class q3 {
	
	public static void main(String[] args) {
		String s = "Battle of the Vowels: Hawaii vs. Grozny";

		System.out.println(reverseString(s));
	}

	public static String reverseString(String source) {
		StringBuilder result = new StringBuilder();
		StringBuilder word = new StringBuilder();
		StringBuilder hold = new StringBuilder();
		
		char character = ' ';
	
		// Loop through the original string
		for(int i = 0; i < source.length(); i++) {
			// If the current character is not a whitespace
			character = source.charAt(i);

			if(character != ' ') {
				// Append to the current word
				word.append(character);
			}
			else {
				// Append the current word to the beginning of the result string
				hold.append(result.toString());
				result.delete(0, result.length());				
				result.append(word + " " + hold.toString());

				// Reset the current word and hold
				word = new StringBuilder();
				hold = new StringBuilder();
			}
				
		} 
		
		// Add the last word
		if(word.length() > 0) {
			 hold.append(result.toString()); 
                         result.delete(0, result.length());
                         result.append(word + " " + hold.toString());	
		}

		return result.toString();

	}

}
