// SRM 614 DIV 2 250

public class MicroStrings {

	public String makeMicroString(int A, int D) {
		StringBuilder result = new StringBuilder();

		for(int i = 0; (A - (i * D)) >= 0; i++) {
			result.append(A - (i * D));
		}

		return result.toString();
	}

}
