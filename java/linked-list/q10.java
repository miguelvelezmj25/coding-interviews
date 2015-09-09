// You’re given the pointer to the head nodes of two sorted linked lists. The data in both lists 
// will be sorted in ascending order. Change the next pointers to obtain a single, merged linked 
// list which also has data in ascending order. Either head pointer given may be null meaning that
// the corresponding list is empty.

Node mergeLists(Node headA, Node headB) {
	// If both heads are null
	if(headA == null && headB == null) {
		return null;
	}

	// Determine the head of the new list
	Node newHead = null;
	Node current = null;

	if(headA != null && headA.data < headB.data) {
		newHead = headA;
		headA = headA.next;
	}
	else {
		newHead = headB;
		headB = headB.next;
	}

	current = newHead;

	// Loop through both lists
	while(headA != null && headB != null) {
		if(headA.data < headB.data) {
			current.next = headA;
			current = headA;
			headA = headA.next;		
		}
		else {
			current.next = headB;
			current = headB;
			headB = headB.next;		
		}
	}

	// Check if there are more nodes in either list
	while(headA != null) {
		current.next = headA;
		current = headA;
		headA = headA.next;		
	}

	while(headB != null) {
		current.next = headB;
		current = headB;
		headB = headB.next;		
	}

	return newHead;
}
