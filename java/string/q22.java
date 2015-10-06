// SRM 609 DIV 2 250

public class MagicalStringDiv2 {

	public int minimalMoves(String S) {
		int middle = S.length() >>> 1;
		int count = 0;

		for(int i = 0; i < middle; i++) {
			if(S.charAt(i) == '<') {
				count++;
			}

			if(S.charAt(i + middle) == '>') {
				count++;
			}
		}

		return count;
	}

}
