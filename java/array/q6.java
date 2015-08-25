// You are given 2 sorted arrays, A and B, where A has a large enough buffer
// at the end to hold B. Write a method to merge B into A in sorted order.

public class q6 {
    
	public static void main(String[] args) {
    		int[] a = new int[10];
		int[] b = {1, 4, 7};
		
		a[0] = 2;
		a[1] = 3;
		a[2] = 5;
		a[3] = 6;
		a[4] = 8;
		a[5] = 9;
		a[6] = 10;

		merge(a, b);

		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}	

	public static void merge(int[] large, int[] small) {
		int[] result = new int[large.length];

		// Keep track of the numbers used from the big and small array
		int smallIndex = 0;
		int largeIndex = 0;

		// Loop through the big array
		int i = 0;
		
		while(smallIndex < small.length) {
			if(small[smallIndex] < large[largeIndex]) {
				result[i] = small[smallIndex];
				smallIndex++;
			}
			else {
				result[i] = large[largeIndex];
				largeIndex++;
			}

			i++;
		}	
		
		// Add the rest of the elements of the large array
		while(i < large.length) {
			result[i] = large[largeIndex];
			largeIndex++;
			i++;
		}
		
		// Add the sorted elements to the original large array
		for(int j = 0; j < large.length; j++) {
			large[j] = result[j];
		}
	}
    
}
