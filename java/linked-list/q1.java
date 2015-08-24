// Write code to remove duplicates from an unsorted linked list.
// How would you solve this problem if a temporary buffer is not allowed.

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class q1 {

    	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		
		removeDuplicates(list);

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}		

	}
	
	public static void removeDuplicates(List<Integer> list) {
		// Set of the nodes that have been seen
		Set<Integer> seenNodes = new HashSet<Integer>();
		// The indeces of the nodes that we need to delete
		List<Integer> deleteIndeces = new LinkedList<Integer>();
		
		// Loop through the elements of the list
		for(int i = 0; i < list.size(); i++) {
			// If we have seen this object before
			if(seenNodes.contains(list.get(i))) {
				// Add the index to delete
				deleteIndeces.add(i);
			}		
			else {
				// Add it to the nodes that we have seen
				seenNodes.add(list.get(i));
			}	

		} 

		// Loop through the indeces that we need to delete		
		for(int i = 0; i < deleteIndeces.size(); i++) {
			// Remove the index value minus the number of indeces deleted.
			// If we do not subtract, then we will have an index mismatch
			// Since the list is being modified
			list.remove(deleteIndeces.get(i).intValue()-i);
		}

	}

}
