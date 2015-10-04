// SRM 596 DIV 2 250

public class FoxAndSightseeing {

	public int getMin(int[] position) {
		int skip = 1;
		int distance = Integer.MAX_VALUE;

		for(int i = 0; i < position.length - 2; i++) {
			int hold = 0;
			int city1 = 0;
			int city2 = 0;

			for(int j = 1; j < position.length; j++) {
				city1 = city2;

				if(j == skip) {
					continue;
				}

				city2 = j;

				hold += Math.abs(position[city1] - position[city2]);			
			}		

			if(hold < distance) {
				distance = hold;
			}

			skip++;
		}	

		return distance;
	}
}
