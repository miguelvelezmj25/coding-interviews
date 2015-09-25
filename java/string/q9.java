// TopCoder SRM 144 DIV 1

public class BinaryCode {
	public String[] decode(String message) {
		String[] result = new String[2];

		result[0] = "NONE";
		result[1] = "NONE";
											
		StringBuilder p = new StringBuilder();
		int hold = 0;
		boolean decoded = true;
							
		for(int i = 0; i < result.length; i++) {
			decoded = true;
			p = new StringBuilder();
			p.append(i);
		
			for(int j = 0; decoded && j < message.length(); j++) {
				if(j == 0) {
					hold = Integer.valueOf(message.charAt(j) + "") - i;
	
					if(hold == 0) {
						p.append(0 + ""); 
					}
					else if(hold == 1) {
						p.append(1 + "");
					}
					else {
						decoded = false;
					}
				}

				else if(j == message.length() - 1) {     
					hold = Integer.valueOf(p.charAt(j) + "") + 
						Integer.valueOf(p.charAt(j-1) + "");
					
					if(hold != Integer.valueOf(message.charAt(j) + "")) {
						decoded = false;
					}
				}
				else {
					hold = Integer.valueOf(message.charAt(j) + "") - 
						Integer.valueOf(p.charAt(j) + "") -
						Integer.valueOf(p.charAt(j-1) + "");			

					if(hold == 0) {
						p.append(0 + "");
					}
					else if(hold == 1) {
						p.append(1 + "");
					}
					else {
						decoded = false;
					}
				}
			}

			if(decoded) {
				result [i] = p.toString();
			}
		}
		
		return result;

	}
			
}
