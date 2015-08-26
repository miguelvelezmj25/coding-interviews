// Calculate the number of 1's that a number has

public class q1 {
	public static void main(String[] args) {
		int a = 3;

		System.out.println(numberOf1s(a));
	}

	public static int numberOf1s(int a) {
		int count = 0;
		int hold = a;

		for(int i = 0; i < 32; i++) {
			if((a & 1) == 1) {
				count++;
			}		
						
			a = a >>> 1;		
		}
		
		return count;

	}	
}
