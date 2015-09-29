// SRM 587 DIV 2

public class InsertZ {

	public String canTransform(String init, String goal) {
		if(init == goal) {
			return "Yes";
		}

		if(init.length() > goal.length()) {
			return "No";
		}

		int i = 0;
		int j = 0;
		while(i < goal.length() && j < init.length()) {
			if(goal.charAt(i) != init.charAt(j)) {
				if(goal.charAt(i) == 'z') {
					j--;
				}
				else {
					return "No";
				}
			}

			i++;
			j++;
		}

		while(i < goal.length()) {
			if(goal.charAt(i) != 'z') {
				return "No";
			}

			i++;
		}

		return "Yes";
	}

}
