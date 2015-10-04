// SRM 597 DIV 2 250

public class LittleElephantAndDouble {
	
	public String getAnswer(int[] A) {
		int max = A[0];
		boolean same = true;

		for(int i = 1; i < A.length; i++) {
			if(A[i] > max) {
				max = A[i];
			}

			if(max != A[i]) {
				same = false;
			}
		}

		if(same) {
			return "YES";
		}

		if(max % 2 == 1) {
			return "NO";
		}

		for(int i = 0; i < A.length; i++) {
			if(max != A[i] && (max % A[i] != 0 || (max / A[i]) % 2 != 0)) {
				return "NO";
			}
		}

		return "YES";
	}
}
