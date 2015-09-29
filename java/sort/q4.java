// SRM 592 DIV 2

public class LittleElephantAndBooks {
	
	public int getNumber(int[] pages, int number) {
		int total = 0;

		mergeSort(pages, 0, pages.length-1);

		for(int i = 0; i < number - 1; i++) {
			total += pages[i];
		}

		total += pages[number];

		return total;
	}

	public void mergeSort(int[] list, int start, int end) {
		if(start >= end) {
			return ;
		}

		int middle = (start +  end) >> 1;

		mergeSort(list, start, middle);
		mergeSort(list, middle + 1, end);

		merge(list, start, middle, end);
	}

	public void merge(int[] list, int start, int middle, int end) {
		int[] temp = new int[list.length];

		for(int i = 0; i < temp.length; i++) {
			temp[i] = list[i];
		}	

		int left = start;
		int right = middle + 1;
		int index = start;

		while(left <= middle && right <= end) {
			if(temp[left] <= temp[right]) {
				list[index] = temp[left];
				left++;
			}
			else {
				list[index] = temp[right];
				right++;
			}

			index++;
		}

		while(left <= middle) {
			list[index] = temp[left];
			left++;
			index++;
		}

		while(right <= end) {
			list[index] = temp[right];
			right++;
			index++;
		}	
	}
}
