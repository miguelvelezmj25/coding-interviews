// SRM 607 DIV 2 250

public class BoundingBox {
	
	public int smallestArea(int[] X, int[] Y) {
		int minX = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;

		for(int i = 0; i < X.length; i++) {
		       if(X[i] < minX) {
			       minX = X[i];
		       }	       

		       if(X[i] > maxX) {
		               maxX = X[i];
		       }

		       if(Y[i] < minY) {
			       minY = Y[i];
		       }

		       if(Y[i] > maxY) {
			       maxY = Y[i];
		       }

		}

		int xLength = Math.abs(maxX - minX);
		int yLength = Math.abs(maxY - minY);

		return xLength * yLength;
	}
}
