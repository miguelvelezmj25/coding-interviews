// SRM 145 DIV 2 250

public class ImageDithering {

	public int count(String dithered, String[] screen) {
		int count = 0;

		String currentElement = "";
		char color = ' ';

		for(int i = 0; i < screen.length; i++) {
			currentElement = screen[i];

			for(int j = 0; j < dithered.length(); j++) {
				color = dithered.charAt(j);

				for(int k = 0; k < currentElement.length(); k++) {
					
					if(color == currentElement.charAt(k)) {
						count++;
					}
				}		
			}	
		}

		return count;
	}
}
