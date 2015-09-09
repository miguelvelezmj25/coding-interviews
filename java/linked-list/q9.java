// You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes
// of the linked lists to check if they are equal. The lists are equal only if they have the 
// same number of nodes and corresponding nodes contain the same data. Either head pointer given 
// may be null meaning that the corresponding list is empty.

int compareLists(Node headA, Node headB) {
	// If both lists are null
	if(headA == null && headB == null) {
		return 1;
	}

	// If one list is null
	if(headA == null || headB == null) {
		return 0;
	}

	// Loop through both lists
	while(headA != null && headB != null) {
		// If the datas do not match
		if(headA.data != headB.data) {
			return 0;
		}	

		// Update the heads
		headA = headA.next;
		headB = headB.next;
	}

	// If one of the heads is not null
	if(headA != null || headB != null) {
		// Since one of the list is null but the other is not
		return 0;
	}

	return 1;
}
