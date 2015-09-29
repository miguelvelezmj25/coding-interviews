// SRM 588 DIV 2

public class KeyDungeonDiv2 {

	public int countDoors(int[] doorR, int[] doorG, int[] keys) {
		int count = 0;

		int temp = 0;

		for(int i = 0; i < doorR.length; i++) {
			if(doorR[i] <= keys[0] && doorG[i] <= keys[1]) {
				count++;
			}
			else if(doorR[i] <= (keys[0] + keys[2])) {
				temp = Math.max(0, doorR[i] - keys[0]);

				if(doorG[i] <= (keys[1] + keys[2] - temp)) {
					count++;
				}
			}	
			else if(doorG[i] <= (keys[0] + keys[2])) {
				temp = Math.max(0, doorG[i] - keys[1]);

				if(doorR[i] <= (keys[0] + keys[2] - temp)) {
					count++;
				}
			}
		}

		return count;
	}
}
