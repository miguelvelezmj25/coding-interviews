// You are given a pointer to the root of a binary tree; print the values in preorder traversal.
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
void Preorder(Node root) {
	// Check if the root is null
	if(root != null) {
		// Print the data
		System.out.print(root.data + " ");
		
		// Visit the left child	
		Preorder(root.left);

		// Visit the right child
		Preorder(root.right);	
	}
}
