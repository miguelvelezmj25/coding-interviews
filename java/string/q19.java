// SRM 603 DIV 2 250

public class MiddleCode {
	
	public String encode(String s) {
		StringBuilder t = new StringBuilder();
		StringBuilder hold = new StringBuilder();

		while(s.length() > 0) {
			hold = new StringBuilder();
			int middle = s.length() >>> 1;

			if(s.length() % 2 == 1) {	
				hold.append(s.substring(0, middle));
				t.append(s.charAt(middle));
				hold.append(s.substring(middle+1, s.length()));
			}	
			else if(s.charAt(middle-1) < s.charAt(middle)) {
				hold.append(s.substring(0, middle-1));
				t.append(s.charAt(middle-1));
				hold.append(s.substring(middle, s.length()));
			}
			else {
				hold.append(s.substring(0, middle));
				t.append(s.charAt(middle));
				hold.append(s.substring(middle+1, s.length()));
			}

			s = hold.toString();
		}

		return t.toString();
	}
}
