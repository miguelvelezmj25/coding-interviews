// Selection sort

public class q2 {

	public static void main(String[] args) {
		int[] list= {8,1,5,3,7,2};

		selectionSort(list);

		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	public static void selectionSort(int[] list) {
		int minIndex = 0;

		for(int i = 0; i < list.length; i++) {
			minIndex = i;

			for(int j = minIndex; j < list.length; j++) {
				if(list[j] < list[minIndex]) {
					minIndex = j;
				}
			}

			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}
}
