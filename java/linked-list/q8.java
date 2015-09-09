// You’re given the pointer to the head node of a linked list. Change the next pointers of the
// nodes so that their order is reversed. The head pointer given may be null meaning that the 
// initial list is empty.
/*
 *  class Node {
 *       int data;
 *       Node next;
 *  }
 */

Node reverse(Node head) {
	// If the head is null
	if(head == null) {
		return null;
	}

	Node current = head;
	Node newHead = null;
	Node temp = null;

	// While there are more nodes to check
	while(current != null) {
		// Create a new node with the same info
		temp = new Node();
		temp.data = current.data;
		temp.next = newHead;

		// This is the new head
		newHead = temp;	

		// Analyze the next node in the original list
		current = current.next;
	}

	// Return the new head
	return newHead;
}
