// SRM 589 DIV 2

public class GooseTattarrattatDiv2 {

	public int getmin(String S) {
		int[] chars = new int[26];

		for(int i = 0; i < chars.length; i++) {
			chars[i] = 0;
		}

		for(int i = 0; i < S.length(); i++) {
			chars[S.charAt(i) - 'a'] += 1;
		}

		int max = 0;

		for(int i = 1; i < chars.length; i++) {
			if(chars[i] > chars[max]) {
				max = i;
			}
		}

		return S.length() - chars[max];
	}
}
