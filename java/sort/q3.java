// Insertion sort

public class q3 {

	public static void main(String[] args) {
		int[] list = {8,1,5,3,7,2};

		insertionSort(list);

		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	public static void insertionSort(int[] list) {
		int index = 0;
		int value = 0;

		for(int i = 1; i < list.length; i++) {
			index = i;
			value = list[index];

			while(index > 0 && value < list[index-1]) {
				list[index] = list[index-1];
				index--;
			}

			list[index] = value;
		}
	}
}
