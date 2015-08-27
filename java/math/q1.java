// Return the remainder

public class q1 {
	
	public static void main(String[] args) {
		int numerator = 17;
		int denominator = 4;

		System.out.println(remainder(numerator, denominator));
	}
	
	public static int remainder(int numerator, int denominator) {
		if(denominator == 0) {
			throw new IllegalArgumentException("You cannot divide by 0");
		}
		
		int remainder = numerator;

		while((remainder - denominator) >= 0) {
			remainder -= denominator;
		}	

		return remainder;
		
	}
}	 
