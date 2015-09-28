// SRM 611 DIV 2 250

public class InterestingNumber {

	public String isInteresting(String x) {
		boolean[] checked = new boolean[x.length()];

		for(int i = 0; i < checked.length; i++) {
			checked[i] = false;
		}
	
		for(int i = 0; i < x.length(); i++) {
			if(checked[i]) {
				continue;
			}

			int value = Integer.valueOf(x.charAt(i) + "");

			if(value >= (x.length() - i - 1) || Integer.valueOf(x.charAt(i+value+1) + 
					"") != value) {
				return "Not interesting";
			}

			checked[i+value+1] = true;
		}	

		return "Interesting";
	}
}
