// SRM 606 DIV 2 250

public class EllysSubstringSorter {

	public String getMin(String S, int L) {
		String min = "ZZ";

		for(int i = 0; i <= (S.length() - L); i++) {
			StringBuilder hold = new StringBuilder();
		
			String subString = S.substring(i, i + L);
			char[] section = subString.toCharArray();

			insertionSort(section);
		
			hold.append(S.substring(0, i));
			
			for(int j = 0; j < section.length; j++) {
				hold.append(section[j]);
			}			

			if((i + L) < S.length()) {
				hold.append(S.substring(i + L, S.length()));
			}

			int operations = Math.min(min.length(), hold.length());

			for(int j = 0; j < operations; j++) {
				if(hold.toString().charAt(j) < min.charAt(j)) {
					min = hold.toString();
					break;
				}
				else if(hold.toString().charAt(j) > min.charAt(j)) {
					break;
				}
			}

		}

		return min;
	}

	public void insertionSort(char[] array) {
		for(int i = 1; i < array.length; i++) {
			char hold = array[i];
			int j = i;

			while(j > 0 && hold < array[j-1]) {
				array[j] = array[j-1];
				j--;
			}

			array[j] = hold;
		}
	}

}
