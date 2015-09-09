// You are given pointer to the root of the binary search tree and two values v1 and v2.
// You need to return the lowest common ancestor (LCA) of v1 and v2 in the binary search tree. 

/*
 * class Node 
 *	 int data;
 *       Node left;
 *       Node right;
 */

static Node lca(Node root, int v1, int v2) {
	// If root is null
	if(root == null) {
		return null;
	}

	// If both numbers are less than the root
	if(v1 < root.data && v2 < root.data) {
		Node current =  lca(root.left, v1, v2);

		if(current != null) {
			return current;
		}
		else {
			return root;
		}
	}
	
	// If both numbers are greater than the root
	if(v1 > root.data && v2 > root.data) {
		Node current = lca(root.right, v1, v2);
		
		if(current != null) {
			return current;
		}
		else {
			return root;
		}
	}

	// If the root equals one of the values
	if(root.data == v1 || root.data == v2) {
		return null;
	}

	return root;

}
