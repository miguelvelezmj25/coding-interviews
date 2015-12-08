// SRM 617 DIV 2 250

public class SilverbachConjecture {

	public int[] solve(int n) {
		int[] result = new int[2];
		int x = 0;
		int y = 0;

		for(int i = 4; i < (n - 4); i++) {
			x = i;
			y = n - x;	

			boolean composite = false;

			for(int j = 2; j < x; j++) {
				if(x % j == 0) {
					composite = true;
					break;
				}
			}

			if(!composite) {
				continue;
			}

			composite = false;


			for(int j = 2; j < y; j++) {
				if(y % j == 0) {
					composite = true;
					break;
				}
			}

			if(!composite) {
				continue;
			}

			result[0] = x;
			result[1] = y;

			return result;
		}

		return result;
	}
}
