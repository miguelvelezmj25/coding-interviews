// SRM 622 DIV 2

public class FibonacciDiv2 {

	public int find(int N) {
		if(N == 0 || N == 1) {
			return 0;
		}

		int result = 0;
		int x = 0;
		int y = 1;

		while(y < N) {
			int hold = x + y;
			x = y;
			y = hold;
		}

		result = Math.min((y - N), (N - x));

		return result;
	}
}
