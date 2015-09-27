// Merge sort

public class q1 {

	public static void main(String[] args) {
		int[] list= {8,1,5,3,7,2};

		mergeSort(list);

		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	public static void mergeSort(int[] list) {
		mergeSort(list, 0, list.length - 1);
	}

	public static void mergeSort(int[] list, int start, int end) {
		if(start == end) {
			return ;
		}

		int middle = (start + end) >> 1;

		mergeSort(list, start, middle);
		mergeSort(list, middle + 1, end);

		merge(list, start, middle, end);
	}

	public static void merge(int[] list, int start, int middle, int end) {
		int [] temp = new int[list.length];

		for(int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}

		int left = start;
		int right = middle + 1;
		int current = start;

		while(left <= middle && right <= end) {
			if(temp[left] <= temp[right]) {
				list[current] = temp[left];
				left++;			
			}
			else {
				list[current] = temp[right];
				right++;
			}

			current++;
		}	

		while(left <= middle) {
			list[current] = temp[left];
			current++;
			left++;
		}

		while(right <= end) {
			list[current] = temp[right];
			current++;
			right++;
		}
		
	}

}
