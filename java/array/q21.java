// SRM 616 DIV 2 250

public class WakingUpEasy {

	public int countAlarms(int[] volume, int S) {
		int count = 0;
		int i = 0;

		while(S > 0) {
			S = S - volume[i];

			count++;
			i = (i + 1) % volumen.length;	
		}

		return count;
	}

}
