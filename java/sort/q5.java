// SRM 620 DIV 2

public class CandidatesSelectionEasy {
	
	public int[] sort(String[] score, int x) {
		int [] result = new int[score.length];

		for(int i = 0; i < score.length; i++) {
			result[i] = i;
		}

		for(int i = 1; i < score.length; i++) {
			String hold = score[i];
			int j = i;

			while(j > 0 && hold.charAt(x) < score[j-1].charAt(x)) {
				score[j] = score[j-1];
				result[j] = result[j-1];
				j--;
			}

			score[j] = hold;
			result[j] = i;
		}

		return result;
	}
}
