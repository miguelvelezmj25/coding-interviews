// You are given a pointer to the root of a binary tree; print the values in inorder traversal.
// Print the values on a single line separated by space.
/* you only have to complete the function given below.  
 * Node is defined as  
 *
 * class Node {
 *     int data;
 *     Node left;
 *     Node right;
 * } 
 */             
void Inorder(Node root) {
	// Check if the root is null
	if(root != null) {
		// Visit the left child	
		Inorder(root.left);

		// Print the data
		System.out.print(root.data + " ");		

		// Visit the right child
		Inorder(root.right);	
	}
}
