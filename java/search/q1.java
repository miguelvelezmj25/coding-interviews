// Implement a function to perform a binary search on a sorted array
// of integers to find the index of a given integer. Use this method 
//declaration: int binarySearch( int[] array, int lower, int upper, int target );

public class q1 {
	
	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,7,8};

		System.out.println(binarySearch(a, 0, a.length - 1, 6));
	}

	public static int binarySearch(int[] array, int low, int high, int value) {
		if(low > high) {
			return -1;
		}
		        
		int middle = (high + low) >>> 1;
			        
		if(value < array[middle]) {
			return binarySearch(array, low, middle - 1, value);
		}
		else if(value> array[middle]) {
			return binarySearch(array, middle + 1, high, value);
		}
		else {
			return middle;
		}
		
	}

}	
