// Function to check if a linked list is a palindrome

import java.util.LinkedList;
import java.util.List;
	
public class q5 {

    	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(4);
		list.add(1);
		list.add(2);

		System.out.println(isPalindrome(list));
	}
	
	public static boolean isPalindrome(List<Integer> list) {
		// Get the half of the list
		int listHalf = list.size() - (list.size() >> 1);

		// Create a new list with the last elements of the list
		List<Integer> lastHalfList = new LinkedList<Integer>();
		
		for(int i = listHalf; i < list.size(); i++) {
			lastHalfList.add(0, list.get(i));
		}

		// Compare the elements
		for(int i = 0; i < (list.size() >> 1); i++) {
			// If the elements do not match
			if(!list.get(i).equals(lastHalfList.get(i))) {
				return false;
			}
		}
		
		// Since all the elements matched
		return true;
	}

}
