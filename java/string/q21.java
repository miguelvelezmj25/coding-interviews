// SRM 608 DIV 2 250

public class OneDimensionalRobotEasy {

	public int finalPosition(String commands, int A, int B) {
		int position = 0;

		for(int i  = 0; i < commands.length(); i++) {
			if(commands.charAt(i) == 'R' && position < B) {
				position++;
			}
			else if(commands.charAt(i) == 'L' && position > (-1 * A)) {
				position--;
			}
		}

		return position;
	}

}
