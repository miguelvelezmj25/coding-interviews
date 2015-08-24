// A child going up a staircase with n steps, can hop up 1, 2, or 3 steps
// at a time. How many ways can the child reach the top?
	
public class q6 {
	
    	public static void main(String[] args) {
		System.out.println(possibleWays(10));
	}
	
	public static int possibleWays(int n) {
		// If no steps or less than 0 steps
		if(n < 1) {
			return 0; 
		}
		
		// If 1 step
		if (n == 1) {
			return 1;
		}

		return possibleWays(n-3) + possibleWays(n-2) + possibleWays(n-1) + 1;
	}

}
