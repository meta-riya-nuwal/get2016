package Single;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {

	NodeTree root = new NodeTree();
	NodeTree currentNode = new NodeTree();
	ArrayList<Integer> al = new ArrayList<Integer>();
	ArrayList<Integer> al1 = new ArrayList<Integer>();

	/*
	 * Add value in linked list
	 */

	/* Function to insert data recursively */
	public void insert(int value) {
		NodeTree newNode = new NodeTree(value);
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
/*calculate preorder
 * 
 */
	void preorder(NodeTree currentNode) {
		if (currentNode != null) {

			System.out.println("PREORDER" + currentNode.data);

			preorder(currentNode.left);
			preorder(currentNode.right);

		}

	}
/*
 * calculate inorder
 */
	ArrayList inorder(NodeTree currentNode) {

		if (currentNode != null) {

			inorder(currentNode.left);
			// System.out.println("INORDER"+currentNode.data);
			al.add(currentNode.data);
			inorder(currentNode.right);
		}

		return al;
	}

	ArrayList inorder2(NodeTree currentNode) {

		if (currentNode != null) {

			inorder2(currentNode.right);

			// System.out.println("INORDER2"+currentNode.data);
			al1.add(currentNode.data);
			inorder2(currentNode.left);

		}
		return al1;
	}

	void postorder(NodeTree currentNode) {
		if (currentNode != null) {

			postorder(currentNode.left);
			System.out.println("POSTORDER" + currentNode.data);
			postorder(currentNode.right);

		}
	}

	NodeTree insertElement() {
		System.out.println("Enter first value");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		int data = sc.nextInt();

		this.insert(data);

		System.out.println("Do you want to enter more values");
		String ch = sc.next();

		while (ch.equalsIgnoreCase("Yes")) {
			System.out.println("Enter data");
			data = sc.nextInt();
			this.insert(data);

			System.out.println("Do you want to enter more values");
			ch = sc.next();

		}
		return root;
	}

	void traverse() {
		this.preorder(root.right);
		this.inorder(root.right);
		this.postorder(root.right);

	}
/*
 * check that two trees are mirror or not
 */
	Boolean checkMirror(BinaryTree a, BinaryTree b) {
		ArrayList first = inorder(a.root.right);
		ArrayList second = inorder2(b.root.right);

		int i = 0, j = 0;
		while (i < first.size() && j < second.size()) {
			if (first.get(i) == second.get(j)) {
				i++;
				j++;
			} else {

				return false;

			}

		}
		return true;
	}

	public static void main(String args[]) {

		BinaryTree a = new BinaryTree();
		a.insertElement();
		// a.traverse();
		BinaryTree b = new BinaryTree();
		b.insertElement();
		// b.traverse();

		Boolean f = a.checkMirror(a, b);
		if (f == false)
			System.out.println("Not an mirror image");
		else
			System.out.println("Mirror image");
	}
}