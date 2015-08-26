// A string consists of ‘0’, ‘1’ and '?'. The question mark can be either 
// '0' or '1'. Find all possible combinations for a string

import java.util.Queue;
import java.util.LinkedList;

public class q5 {
	
	public static void main(String[] args) {
		// Possible strings
		String zero = "0";
		String one = "1";
		
		// Create a list of the strings that we need to add other strings to
		Queue<String> strings = new LinkedList<String>();
		
		// Append the empty string as the base case
		strings.add("");
		
		String tmp1 = "";
		String tmp2 = "";

		// Just do 10 times
		int i = 0;
		
		while(i < 10) {
			// Get a string
			tmp1 = strings.remove();
			
			// Add zero to it
			tmp2 = tmp1 + zero;
			
			// Print
			System.out.println(tmp2);
			
			// Add it to the queue
			strings.add(tmp2);

			// Add one to the string reomved
			tmp2 = tmp1 + one;

			// Print
			System.out.println(tmp2);

			// Add it to the queue
			strings.add(tmp2);
			
			// Reset the tmp1 string
			tmp1 = "";									
		
			i++;
		}
	}

}
