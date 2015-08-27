// Remove duplicates from an array

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
	
public class q7 {
    
	public static void main(String[] args) {
		int[] list = {1, 3, 5, 3, 7, 3, 1, 1, 5};
		
		list = removeDuplicates(list);

		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}	

	public static int[] removeDuplicates(int[] list) {
		Set<Integer> unique = new HashSet<Integer>();
		List<Integer> uniqueList = new LinkedList<Integer>();
		
		for(int i = 0; i < list.length; i++) {
			if(!unique.contains(list[i])) {
				unique.add(list[i]);
				uniqueList.add(list[i]);				
			}
		}	

		int[] result = new int[uniqueList.size()];

		for(int i = 0; i < result.length; i++) {
			result[i] = uniqueList.remove(0);
		} 

		return result;

	}
    
}
