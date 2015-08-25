// Converts a string to a signed integer.

public class q4 {
	
	public static void main(String[] args) {
		String number = "-1234";

		System.out.println(stringToInt(number));
	}

	public static int stringToInt(String number) {
		int result = 0;
		
		// Loop through the number
		for(int i = 1; i < number.length(); i++) {
			// Multiply the result by 10
			result *= 10;
			
			// Add the new digit
			result += number.charAt(i) - '0';
		}	

		// Set the sign
		int sign = 1;
		
		// If the first character is a minus sign
		if(number.charAt(0) == '-') {
			// Set the sign to negative
			sign = -1;
		}		
		
		// Multiply by the sign
		result *= sign;

		return result;
	}

}
