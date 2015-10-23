void decode (String S ,Node root) {
	StringBuilder result = new StringBuilder();
	Node currentNode = root;
	char currentChar;
			    
	for(int i = 0; i < S.length(); i++) {
		currentChar = S.charAt(i);

		if(currentChar == '0') {
			currentNode = currentNode.left;
		}
		else {
			currentNode = currentNode.right;
		}

		if(currentNode.left == null && currentNode.right == null) {
			result.append(currentNode.data);
			currentNode = root;
		}

	}

	System.out.println(result);
				       
    }
