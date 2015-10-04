// SRM 598 DIV 2 250

public class ErasingCharacters {

	public String simulate(String s) {
			
		while(s.length() > 0) {
			char min = Character.MAX_VALUE;

			for(int i = 0; i < s.length()-1; i++) {
				if(s.charAt(i) == s.charAt(i+1) && s.charAt(i) < min) {
					min = s.charAt(i);
				}	
			}

			if(min == Character.MAX_VALUE) {
				return s;
			}

			StringBuilder temp = new StringBuilder();

			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != min || i == s.length()-1 || s.charAt(i+1) !=
						min) {
					temp.append(s.charAt(i));
				}
				else { 
					i++;
				}
			}

			s = temp.toString();

		}

		return s;	
	}

}
