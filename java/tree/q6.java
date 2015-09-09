// You are given a pointer to the root of a binary tree. You need to print the level order
// traversal of this tree. In level order traversal, we visit the nodes level by level from 
// left to right. 
// Print the values in a single line seperated by a space.

/*
 * class Node 
 *	 int data;
 *       Node left;
 *       Node right;
 */

void levelOrder(Node root) {
	Queue<Node> nodes = new LinkedList<Node>();	
	Node current = null;
	
	// Add the root in the queue	
	nodes.add(root);

	// While the queue is not empty
	while(!nodes.isEmpty()) {
		// Dequeue a node
		current = nodes.remove();

		// Print the data	
		System.out.print(current.data + " ");

		// If there is a left child
		if(current.left != null) {
			// Enqueue it 
			nodes.add(current.left);
		}

		// If there is a right child
		if(current.right != null) {
			// Enqueue it
			nodes.add(current.right);
		}	
	}
}
