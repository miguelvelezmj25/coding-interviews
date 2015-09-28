// SRM 612 Div 2

public class LeftAndRightHandedDiv2 {

	public int count(String S) {

		int collisions = 0;

		for(int i = 0; i < S.length()-1; i++) {
			if(S.charAt(i) == 'R' && S.charAt(i+1) == 'L') {
				collisions++;
				i++;
			}	
		}

		return collisions;
	}
}

