// SRM 618 DIV 2 250

public class WritingWords {

	public int write(String word) {
		int result = 0;

		char[] characters = word.toCharArray();

		for(int i = 0; i < characters.length; i++) {
			result += characters[i] - 'A' + 1;
		}

		return result;
	}
}
