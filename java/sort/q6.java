// SRM 621 DIV 2

public class TwoWaysSorting {
	
	public String sortingMethod(String[] stringList) {
		boolean length = true;
		boolean lexi = true;

		for(int i = 0; i < stringList.length - 1; i++) {
			if(stringList[i].length() > stringList[i + 1].length()) {
				length = false;
				break;
			}
		}

		for(int i = 0; i < stringList.length - 1; i++) {
			if(stringList[i].compareTo(stringList[i + 1]) > 0) {
				lexi = false;
				break;
			}
		}	

		if(length && lexi) {
			return "both";
		}
		else if(length) {
			return "lengths";
		}
		else if(lexi) {
			return "lexicographically";
		}
		else {
			return "none";
		}
	}
}
