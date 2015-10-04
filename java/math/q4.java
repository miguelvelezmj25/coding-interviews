// SRM 601 DIV 2 250

public class WinterAndMandarins {
	
	public int getNumber(int[] bags, int K) {
		insertionSort(bags);

		int difference = Integer.MAX_VALUE;

		for(int i = 0; i <= bags.length - K; i++) {
			int count = 0;
			
			for(int j = 0; j < (K - 1); j++) {
				count += Math.abs(bags[i+j]-bags[i+1+j]);
			}

			if(count < difference) {
				difference = count;
			}
		}

		return difference;
	}

	public static void insertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int hold = array[i];
			int j = i;

			while(j > 0 && hold < array[j-1]) {
				array[j] = array[j-1];
				j--;
			}

			array[j] = hold;
		}
	}
}
