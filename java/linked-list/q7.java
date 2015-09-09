// You are given the pointer to the head node of a linked list and you need to print all its 
// elements in reverse order from tail to head, one element per line. The head pointer may be 
// null meaning that the list is empty - in that case, do not print anything!
/*
 *  class Node {
 *       int data;
 *       Node next;
 *  }
 */

void reversePrint(Node head) {
	// If the head is null
	if(head == null) {
		return ;
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

	// Get the new head
	current = newHead;

	// While there are nodes to examine
	while(current != null) {
		System.out.println(current.data);

		// Get the next node
		current = current.next;
	}
}
