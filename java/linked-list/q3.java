// Partition a linked list around a value x, such that all nodes less than x
// come before all nodes greater than or equal to x.

import java.util.LinkedList;
import java.util.List;
	
public class q3 {

    	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		list.add(2);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(6);
		list.add(5);
		list.add(3);
		
		partitionAround(list, 3);

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}		

	}
	
	public static void partitionAround(List<Integer> list, int x) {
		// Create two lists for smaller and bigger elements
		List<Integer> smaller = new LinkedList<Integer>();
		List<Integer> greaterEqual = new LinkedList<Integer>();	
		
		// Loop through the list
		for(int i = 0; i < list.size(); i++) {
			// If element is less than x
			if(list.get(i).intValue() < x) {
				// Add it to the smaller list
				smaller.add(list.get(i));
			}	
			else {
				//Add it to the greater or equal list
				greaterEqual.add(list.get(i));
			}
		}

		// Clear all the elements from the original list
		list.clear();

		// Add the lists to the original list
		for(int i = 0; i < smaller.size(); i++) {
			list.add(smaller.get(i));
		}
		
		for(int i = 0; i < greaterEqual.size(); i++) {
			list.add(greaterEqual.get(i));
		}
	}


}
