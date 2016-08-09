package session8;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySort {

	static Node root = new Node();
	Node currentNode = new Node();
	ArrayList<Integer> al = new ArrayList<Integer>();
	ArrayList<Integer> al1 = new ArrayList<Integer>();

	/*
	 * Add value in linked list
	 */

	/* Function to insert data recursively */
	public void insert(int value) {
		Node newNode = new Node(value);
		if (root.right == null) {

			root.right = newNode;
			return;

		}
		currentNode = root.right;
		while (true) {

			if (currentNode.data > value) {
				if (currentNode.left == null) {
					currentNode.left = newNode;

					break;
				} else {
					currentNode = currentNode.left;
				}
			} else {

				if (currentNode.right == null) {
					currentNode.right = newNode;

					break;
				} else {
					currentNode = currentNode.right;

				}
			}

		}

	}
/*
 * inorder of tree will be returned that will be give the sorted result 
 */
	ArrayList inorder(Node currentNode) {

		if (currentNode != null) {

			inorder(currentNode.left);
			// System.out.println("INORDER"+currentNode.data);
			al.add(currentNode.data);
			inorder(currentNode.right);
		}

		return al;
	}

	void insertElement(int array[]) {

		for (int i = 0; i < array.length; i++) {

			this.insert(array[i]);
		}

	}

	ArrayList treesort() {
		ArrayList al = this.inorder(root.right);
		return al;

	}

	public static void main(String args[]) {

		BinarySort a = new BinarySort();
		System.out.println("Enter student's roll number in disorder way");
		int array[] = { 1, 34, 56, 23, 2, 3 };
		a.insertElement(array);
		ArrayList al = a.treesort();
		System.out.println(al);

	}
}