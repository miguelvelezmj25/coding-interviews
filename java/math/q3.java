// SRM 600 DIV 2 250

public class TheShuttles {

	public int getLeastCost(int[] cnt, int baseCost, int seatCost) {
		int max = cnt[0];

		for(int i = 1; i < cnt.length; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
			}
		}

		int min = Integer.MAX_VALUE;
		int hold = 0;
		int cost = 0;

		for(int i = 1; i <= max; i++) {
			cost = 0;
			hold = baseCost + (i * seatCost);

			for(int j = 0; j < cnt.length; j++) {
				cost += hold * Math.ceil((double)cnt[j]/i);
			}

			if(cost < min) {
				min = cost;
			}		
		}

		return min;
	}
}
