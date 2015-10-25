// Say what you see

static String[] say_what_you_see(String[] input_strings) {       
	List<String> list = new ArrayList< >();
	StringBuilder current = new StringBuilder();
	String number;
	char key = ' ';
	int value = 0;
						        
	for(int i = 0; i < input_strings.length; i++) {
		number = input_strings[i];
		
		key = number.charAt(0);
		
		for(int j = 0; j < number.length(); j++) {       
			if(key == number.charAt(j) || j == 0) {
				value++;
			}
			else {
				current.append(value);
				current.append(key);
				
				value = 1;
				key = number.charAt(j);
			}
		}
		
		current.append(value);
		current.append(key);
		list.add(current.toString());

		current = new StringBuilder();
		
		value = 0;
	}
	
	String[] result = new String[list.size()];
	
	for(int i = 0; i < list.size(); i++) {
		result[i] = list.get(i);
	}

	return result;

}
