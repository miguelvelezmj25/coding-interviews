// SRM 593 DIV 2

public class RaiseThisBarn {
	
	public int calc(String str) {
		int count = 0;
		int cows = 0;

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'c') {
				cows++;
			}
		}

		if(cows % 2 == 1) {
			return count;
		}

		if(cows == 0) {
			return str.length()-1;
		}

		int cowsSeen = 0;
		cows = cows >> 1;

		for(int i = 0; i < str.length() && cowsSeen <= cows; i++) {
			if(str.charAt(i) == 'c') {
				cowsSeen++;
			}
			
			if(cowsSeen == cows) {
				count++;
			}
		}

		return count;
	}
}
