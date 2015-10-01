// SRM 594 DIV 2

public class FoxAndClassroom {
	
	public String ableTo(int n, int m) {
		if(n == m) {
			return "Impossible";
		}

		int count = 0;
		int[][] seats = new int[n][m];
		int totalSeats = n * m;

		int r = 0;
		int c = 0;

		while(count != totalSeats) {
			if(seats[r][c] == 1) {
				return "Impossible";
			}
			
			seats[r][c] = 1;
			count++;
			
			r = (r + 1) % n;
			c = (c + 1) % m;

		}
		
		return "Possible";
	}
}
