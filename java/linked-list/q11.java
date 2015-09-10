// You’re given the pointer to the head node of a linked list and a specific position. Counting 
// backwards from the tail node of the linked list, get the value of the node at the given 
// position. 

int getNode(Node head, int n) {
	Node newHead = null;
	Node newNode = null;
	Node current = head;

	// While there are more nodes to analyze
	while(current != null) {
		newNode = new Node();
		newNode.data = current.data;
		newNode.next = newHead;

		newHead = newNode;

		current = current.next;
	}

	// Loop through the reverse list until we find the node we want
	current = newHead;

	for(int i = 0; i < n; i++) {
		current = current.next;
	}

	return current.data;
}
