// You’re given the pointer to the head nodes of two linked lists that merge together at some 
// node. Find the node at which this merger happens. The two head nodes will be different and 
// neither will be NULL.

int findMergeNode(Node headA, Node headB) {
	Set<Node> seenA = new HashSet<Node>();
	Set<Node> seenB = new HashSet<Node>();

	// Loop through both lists
	Node currentA = headA;
	Node currentB = headB;
	
	while(currentA != null && currentB != null) {
		// If the currentB has been seen in list A or current A has been seen in list B
		if(seenA.contains(currentB) || seenB.contains(currentA)) {
			return currentB.data;
		}

		// If the current nodes are the same
		if(currentA.equals(currentB)) {
			return currentA.data;
		}

		// Add the nodes to their lists
		seenA.add(currentA);
		seenB.add(currentB);

		// Update the nodes
		currentA = currentA.next;
		currentB = currentB.next;
	}

	// If current A is in list B
	while(currentA != null) {
	       if(seenB.contains(currentA)) {
			return currentA.data;
	       }

	       currentA = currentA.next;
	}

	// If current B is in list A
	while(currentB != null) {
	       if(seenA.contains(currentB)) {
			return currentB.data;
	       }

	       currentB = currentB.next;
	}

	return Integer.MIN_VALUE;
}
