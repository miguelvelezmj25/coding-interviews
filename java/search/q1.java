// Implement a function to perform a binary search on a sorted array
// of integers to find the index of a given integer. Use this method 
//declaration: int binarySearch( int[] array, int lower, int upper, int target );

public class q1 {
	
	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,7,8};

		System.out.println(binarySearch(a, 0, a.length - 1, 6));
	}
	
	public static int binarySearch(int[] array, int lower, int upper, int target) {
		while(lower < upper) {
			// Find the middle of the array
			int middle = (upper + lower) >> 1;

			if(target < array[middle]) {
				return binarySearch(array, lower, middle, target);
			}		
			else if(target > array[middle]) {
				return binarySearch(array, middle + 1, upper, target);
			}	
			else {	
				return middle;
			}
		
		}
		
		return -1;
	}
}	 
