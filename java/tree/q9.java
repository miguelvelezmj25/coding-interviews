// Print all paths from root to leaf in a Binary tree

import java.util.List;
import java.util.ArrayList;

public class q9 {

	public static void main(String[] args) {

		Node root = new Node(0);
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);

		root.left = one;
		root.right= two;
		two.left = three;
		one.right = four;

		printPaths(root, new ArrayList<Node>());
	}

	public static void printPaths(Node root, List<Node> paths) {
		if(root == null) {
			return ;
		}

		paths.add(root);

		if(root.left == null && root.right == null) {	
			for(int i = 0; i < paths.size(); i ++) {	
				System.out.print(paths.get(i).value + " ");
			}

			System.out.println();
			paths.remove(paths.size()-1);
		}
		else{
			printPaths(root.left, paths);
			printPaths(root.right, paths);

			paths.remove(paths.size()-1);
		}
	}

}

class Node {
	public int value;
	public Node left;
	public Node right;

	public Node(int value) {
		this.value = value;
	}

}
