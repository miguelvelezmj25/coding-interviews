/*
	Implement an algorithm to determine if a string has all unique characters. What if you
	can not use additional data structures?
*/

public class question1 {

	public static void main(String[] args) {
		System.out.println(question1.uniqueCharacters("miguel") + "\n"); // True
		System.out.println(question1.uniqueCharacters("miguelguel")); // False
	}

	/**
	 * Check if the string contains unique characters 
	 */
	public static boolean uniqueCharacters(String string) {
		// Array for all possible ASCII characters
		int[] characters = new int[128];

		// Loop through the characters of the string
		for(int i = 0; i < string.length(); i++) {
			// Get the current character
			int character = string.charAt(i);
			System.out.println(character + " - " + string.charAt(i));

			// Search if it is in the array
			if(characters[character] == 1) {
				// It means that the character has been seen
				return false;
			}

			// The character has not been seen, so add set in the array that we have seen it
			characters[character] = 1;
		}

		// If we looped through all the characters without returning, it means that all of
		// them are unique
		return true;
	}

}
	
