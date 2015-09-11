// You’re given the pointer to the head node of a doubly linked list. Reverse the order of the 
// nodes in the list. The head node might be NULL to indicate that the list is empty.

Node reverse(Node head) {
	// If the list is null
	if(head == null) {
		return null;
	}

	Node newNode = new Node();

	// Special case for the head
	newNode.data = head.data;		

	Node newHead = newNode;

	// Loop thorugh the entire list
	Node current = head.next;

	while(current != null) {
		newNode = new Node();

		newNode.data = current.data;
		newNode.next = newHead;
		newHead.prev = newNode;
		
		newHead = newNode;

		current = current.next;
	}

	return newHead;
}
