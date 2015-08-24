// Implement an algorithm to find the kth to last element of a singly linked list.

import java.util.LinkedList;
import java.util.List;
	
public class q2 {

    	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		deleteElementFromEnd(list, 0);

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}		

	}
	
	public static void deleteElementFromEnd(List<Integer> list, int elementFromEnd) {
		// fromStart = size - end - 1
		int indexFromBeginning = list.size() - elementFromEnd - 1;
		
		// remove the element
		list.remove(indexFromBeginning);
	}

}
