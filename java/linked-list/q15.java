// You’re given the pointer to the head node of a sorted doubly linked list and an integer to 
// insert into the list. Create a node and insert it into the appropriate position in the list. 
// The head node might be NULL to indicate that the list is empty.

Node sortedInsert(Node head, int data) {	
	Node newNode = new Node();
	newNode.data = data;

	// If list is empty
	if(head == null) {		
		return newNode;
	}

	// Loop through the list
	Node current = head;
	Node putBefore = head;
	Node previous = null;

	while(current != null) {
		if(current.data < data) {
			previous = current;
			current = current.next;
			putBefore = current;	
		}	
		else {
			// Set the current to null since we found a place to insert
			current = null;
		}	
	}

	previous.next = newNode;
	newNode.prev = previous;
	newNode.next = putBefore;

	if(putBefore != null) {
		putBefore.prev = newNode;
	}

	return head;
}
