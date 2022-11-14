package com.greatlearning.dsa.gradedproject.question2;

// Converting BST into a right skewed tree in ascending order
public class SkewedBST {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	// Method to traverse the right skewed tree using recursion
	static void rightSkewedTraversal(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		rightSkewedTraversal(root.right);
	}

	// Method to convert BST into a right skewed tree in ascending order asc
	static void bstRightSkewedAscending(Node root, int asc) {
		if (root == null) {
			return;
		}

		// Condition to check the order asc in which the skewed tree to be maintained
		if (0 < asc) {
			bstRightSkewedAscending(root.right, asc);
		} else {
			bstRightSkewedAscending(root.left, asc);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		// Condition to check if the root Node of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// Recursive condition to check left or right subtree based on order asc
		if (0 < asc) {
			bstRightSkewedAscending(leftNode, asc);
		} else {
			bstRightSkewedAscending(rightNode, asc);
		}
	}

	// Driver Code
	public static void main(String[] args) {
		SkewedBST.node = new Node(50);
		SkewedBST.node.left = new Node(30);
		SkewedBST.node.right = new Node(60);
		SkewedBST.node.left.left = new Node(10);
		SkewedBST.node.right.left = new Node(55);
		int asc; // order
		/* 
		 * Order asc of the Skewed tree can be defined as follows -
		 * For Increasing order - 0, Decreasing order - 1
		 */
		asc = 0;
		
		// Method calls
		bstRightSkewedAscending(node, asc);
		rightSkewedTraversal(headNode);
	}
	
}
