// SRM 613 DIV 2 250

public class TaroString {

	public String getAnswer(String s) {
		StringBuilder result = new StringBuilder();

		for(int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);

			if(current == 'C' || current == 'A' || current == 'T') {
				result.append(current); 
			}
		}

		if(result.length() == 3 && result.charAt(0) == 'C' && result.charAt(1) == 'A' &&
				result.charAt(2) == 'T') {
			return "Possible";
		}

		return "Impossible";

	}

}
