package session8;

public class Node {

	/*
	 * Node of single linked list that contains two pointers next and previous
	 */
	public int data;
	Node left, right;

	public Node(int value) {

		data = value;
		left = null;
		right = null;
	}

	Node() {
		left = null;
		right = null;
	}

}