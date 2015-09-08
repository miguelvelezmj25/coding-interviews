// The height of a binary tree is the number of nodes on the largest path from root to any leaf. 
// You are given a pointer to the root of a binary tree. Return the height of the tree. 
// Return a single value equal to the hegith of the binary tree.

/*
 * class Node 
 *	 int data;
 *       Node left;
 *       Node right;
 */

int height(Node root) {
	// Check if the root is null
	if(root == null) {
		return 0;
	}

	// If this is a leaf node
	if(root.left == null && root.right == null) {
		return 1;
	}	

	// Get the height of the left and right child
	int heightLeft = height(root.left);
	int heightRight = height(root.right);

	// Return the maximum height of the left or right child
	if(heightLeft > heightRight) {
		return 1 + heightLeft;	
	}
	else {
		return 1 + heightRight;
	}
	
}
