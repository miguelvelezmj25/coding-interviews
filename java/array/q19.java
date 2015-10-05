// Determine whether a circular array of integers has a single complete cycle

import java.util.*;

public class q19 {
	
	public static void main(String[] args) {
		int[] array = {1,1,2};

		System.out.println(hasCycle(array));
	}

	public static boolean hasCycle(int[] array) {
		Set<Integer> seeIndex = new HashSet<Integer>();
		int i = 0;

		while(!seeIndex.contains(i)) {
			seeIndex.add(i);
			i = (i + array[i]) % array.length;	
		}

		if(seeIndex.size() == array.length && i == 0) {
			return true;
		}
		
		return false;
	}
}	
