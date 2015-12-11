// SRM 623 DIV 2

public class CatchTheBeatEasy {

	public String ableToCatchAll(int[] x, int[] y) {
		int playerPosition = 0;	
		int timeElapsed = 0;
		int previous = -1;

		for(int i = 0; i < x.length; i++) {
			int min = -1;
			int value = Integer.MAX_VALUE;

			for(int j = 0; j < y.length; j++) {
				if(previous != j && y[j] < value && y[j] - timeElapsed >= 0) {
					min = j;
					value = y[min];
				}	
			}

			previous = min;

			timeElapsed += Math.abs(x[min] - playerPosition);
			playerPosition = x[min];	

			if(y[min] - timeElapsed < 0) {
				return "Not able to catch";	
			}

			if(y[min] - timeElapsed != 0) {
				timeElapsed += y[min] - timeElapsed;
			}
		}

		return "Able to catch";
	}
}
