// Find the maxinmum value of a list

public class q3 {
	
	public static void main(String[] args) {
		int[] a = {3,5,1,6,9,7,2};

		System.out.println(findMax(a));
	}
	
	public static int findMax(int[] list) {
		int max = list[0];

		for(int i = 1; i < list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		
		return max;
	}
}	 
