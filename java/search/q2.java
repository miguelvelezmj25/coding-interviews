// Find the minimum value of a list

public class q2 {
	
	public static void main(String[] args) {
		int[] a = {3,5,1,6,9,7,2};

		System.out.println(findMin(a));
	}
	
	public static int findMin(int[] list) {
		int min = list[0];

		for(int i = 1; i < list.length; i++) {
			if(list[i] < min) {
				min = list[i];
			}
		}
		
		return min;
	}
}	 
