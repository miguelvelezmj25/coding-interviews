// You're given the pointer to the head node of a sorted linked list, where the data in the nodes
// is in ascending order. Delete as few nodes as possible so that the list does not contain any 
// value more than once. The given head pointer may be null indicating that the list is empty.

Node removeDuplicates(Node head) {
	// If the list is empty
	if(head == null) {
		return null;
	}

	Node current = head;

	// Loop through the entire list
	while(current != null) {
		// If the next node has the same data
		if(current.next != null && current.data ==  current.next.data) {
			// Eliminate the next node by changing the reference
			// to the next of the next node
			current.next = current.next.next;

			// Don't update the reference since there might be multiple repeated
			// elements
		}
		else {
			// Update the current node
			current = current.next;
		}

	}

	return head;
}
