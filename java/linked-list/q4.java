// You have two numbers represented by a linked list, where each node
// contains a single digit. The digits are stored in reverse order,
// such that the 1's digit is at the head of the list. Write a function
// that adds the two numbers and returns the sum as a linked list

import java.util.LinkedList;
import java.util.List;
	
public class q4 {

    	public static void main(String[] args) {
		List<Integer> number1 = new LinkedList<Integer>();
		List<Integer> number2 = new LinkedList<Integer>();
		
		number1.add(2);
		number1.add(3);
		number2.add(1);
		number2.add(8);
	
		List<Integer> result = addLinkedListNumbers(number1, number2);

		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(result.size() - 1 - i));
		}		

	}
	
	public static List<Integer> addLinkedListNumbers(List<Integer> number1, List<Integer> number2) {
		List<Integer> result = new LinkedList<Integer>();

		// Carry value
		int carry = 0;

		// Maximum number in terms of number of digits
		int mostDigits = Math.max(number1.size(), number2.size());
		
		// Current value
		int value = 0;

		// Current digits
		int digit = 0;
		int digit1 = 0;
		int digit2 = 0;

		// Loop through both numbers
		for(int i = 0; i < mostDigits; i++) {
			// Get the current values
			if(i < number1.size()) {
				digit1 = number1.get(i).intValue();
			}
			else {
				digit1 = 0;
			}

			if(i < number2.size()) {
				digit2 = number2.get(i).intValue();
			}
			else {
				digit2 = 0;
			}

			// Add the two digits plus the carry
			value = carry + digit1 + digit2;			  
			
			// Get the corresponding digit
			digit = value % 10;

			// Add it to the result
			result.add(digit);	
			
			// Get the new carry
			carry = value / 10;
		}

		// If we still have a carry
		if(carry != 0) {
			// Add it to the result
			result.add(carry);
		}

		return result;	
	}

}
