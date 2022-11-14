package com.greatlearning.dsa.gradedproject.question2;

// class Node is defined
public class Node {
	int value;
	Node left, right;

	/*
	 * Constructor method Node that allocates a new node with the given data and
	 * NULL left and right pointers.
	 */
	Node(int item) {
		value = item;
		left = right = null;
	}
}
