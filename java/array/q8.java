// Return distinct values and their counts

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
	
public class q8 {
    
	public static void main(String[] args) {
		int[] list = {1, 3, 5, 3, 7, 3, 1, 1, 5};
		
		Map<Integer, Integer> intToCount = count(list);
			
		for(Entry<Integer,Integer> entry: intToCount.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}	

	public static Map<Integer, Integer> count(int[] list) {
		Map<Integer,Integer> intToCount = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < list.length; i++) {
			if(intToCount.get(list[i]) == null) {
				intToCount.put(list[i], 1);
			}
			else {
				intToCount.put(list[i], intToCount.get(list[i]) + 1);
			}
		}	
		
		return intToCount;
	}
    
}
