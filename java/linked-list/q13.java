// You’re given the pointer to the head node of a linked list. Find whether the list contains any
// cycle (or loop). A linked list is said to contain cycle if any node is re-visited while 
// traversing the list. The head pointer given may be null meaning that the list is empty.

int hasCycle(Node head) {
	// If list is null
	if(head == null) {
		// No cycle
		return 0;
	}

	Set<Node> visitedNodes = new HashSet<Node>();
	
	Node current = head;

	// Loop through the list
	while(current != null) {
		// If we have seen this node befor
		if(visitedNodes.contains(current)) {
			return 1;
		}

		// Add it to the set
		visitedNodes.add(current);

		// Update current
		current = current.next;
	}

	// If we get here, there are no cycles
	return 0;
}
