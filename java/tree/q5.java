// You are given a pointer to the root of a binary tree. Print the top view of the binary tree. 
// Seems like top view is all the left most nodes and the right most nodes
// Print the values on a single line separated by space.

/*
 * class Node 
 *	 int data;
 *       Node left;
 *       Node right;
 */

void topView(Node root) {
	// If the root has a left child
	if(root.left != null) {
		// Create a stack of nodes for the left branch
		Stack<Node> leftBranch = new Stack<Node>();

		// Get the left child
		Node leftChild = root.left;

		// While there are more left children
		while(leftChild != null) {
			// Push the child in the stack
			leftBranch.push(leftChild);

			// Get its left child
			leftChild = leftChild.left;
		}

		// While the stack is not empty
		while(!leftBranch.isEmpty()) {
			// Print the data
			System.out.print(leftBranch.pop().data + " ");
		}	
	}

	System.out.print(root.data + " ");

	if(root.right != null) {
		// While there are right children	
		Node rightChild = root.right;

		while(rightChild != null) {
			// Print the child
			System.out.print(rightChild.data + " ");

			// Get the right child
			rightChild = rightChild.right;
		}		
	}
}
