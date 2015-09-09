// You are given a pointer to the root of a binary search tree and a value to be inserted into
// the tree. Insert this value into its appropriate position in the binary search tree and return
// the root of the updated binary tree.

/*
 * class Node 
 *	 int data;
 *       Node left;
 *       Node right;
 */

static Node insert(Node root, int value) {
	Node current = root;

	// Create the new node
	Node newNode = new Node();
	newNode.left = null;
	newNode.right = null;
	newNode.data = value;

	// If the root is null
	if(current == null) {
		// Set the new node as the root
		root = newNode;

		return root;
	}

	// Loop until we find a place to inser the node
	while(current != null) {
		// If the new node should go on the left
		if(current.data > newNode.data) {
			// If there is a left child
			if(current.left != null) {
				// Update the current node
				current = current.left;
			}
			else {
				// Set the left child to the new node
				current.left = newNode;	
				
				// Set the current to null to exit
				current = null;
			}
		}
		else {
			// If there is a right child
			if(current.right != null) {
				// Update the current node
				current = current.right;
			}
			else {
				// Set the right child to the new node
				current.right = newNode;

				// Set the current to null to exit
				current = null;
			}
		}
	}		

	return root;
}
