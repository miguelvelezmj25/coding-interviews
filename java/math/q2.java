// SRM 591 DIV 2

public class TheArithmeticProgression {
	
	public double minimumChange(int a, int b, int c) {
		double min = 0.0;

		if((b - a) == (c - b)) {
			return min;
		}

		min = Math.abs(b - a) + Math.abs(c - b);
		min = min/2.0;

		if((b - min - a) == (c - (b - min))) {
			return min;
		}
		else if((b + min - a) == (c - (b + min))) {
			return min;
		}
		else {
			return 0.0;
		}
	}
}
