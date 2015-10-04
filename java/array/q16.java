// SRM 602 DIV 2 250

public class TypoCoderDiv2 {

	public static final int START_RATING = 500;

	public int count(int[] rating) {
		int count = 0;
		boolean ceil = true;

		for(int i = 0; i < rating.length; i++) {
			if(rating[i] >= 1200 && ceil) {
				count++;
				ceil = !ceil;
			}
			else if(rating[i] < 1200 && !ceil) {
				count++;
				ceil = !ceil;
			}	
		}

		return count;
	}
}
