// SRM 615 DIV 2 250

public class AmebaDiv2 {

	public int simulate(int[] X, int A) {
		for(int i = 0; i < X.length; i++) {
			if(X[i] == A) {
				A = A << 1;
			}
		}

		return A;
	}

}
