// SRM 599 DIV 2 250

public class MiniatureDachshund {

	public int maxMikan(int[] mikan, int weight) {
		if(weight == 5000) {
			return 0;
		}

		insertionSort(mikan);

		int count = 0;

		for(int i = 0; weight < 5000 && i < mikan.length; i++) {
			weight += mikan[i];

			if(weight <= 5000) {
				count++;	
			}
		}

		return count;
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
