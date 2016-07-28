package Single;

import java.util.Scanner;

public class LinkedList<T> {

	Node<T> start = new Node<T>();
	Node<T> currentNode = null;
/*
 * Add value in linked list
 */
	void add(T value) {
		Node<T> newNode = new Node<T>();
		newNode.data = value;

		if (start.next == null) {
			start.next = newNode;
		} else {
			currentNode = start.next;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		newNode.next = null;
	}
/*
 * display linked list
 */
	void display() {
		currentNode = start.next;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}
/*
 * add item at particular location
 */
	Boolean partiLoc(int loc, T value) {
		int count = 1;
		Node<T> newNode = new Node<T>();
		newNode.data = value;
		if (loc == 1) {
			newNode.next = start.next;
			start.next = newNode;

			currentNode = start.next;
			return true;
		} else {
			currentNode = start.next;
			while (currentNode.next != null) {
				++count;
				if (count == loc) {
					newNode.next = currentNode.next;
					currentNode.next = newNode;

					return true;
				}

				currentNode = currentNode.next;

			}

		}
		return false;
	}
/*
 * remove particular value from list 
 */
	Boolean removeItem(T value) {
		Node<T> prev = new Node<T>();

		currentNode = start.next;
		if (currentNode.data == value) {

			// currentNode = start.next;
			start.next = currentNode.next;
			return true;
		} else {

			while (currentNode.next != null) {
				if (currentNode.data == value) {
					prev.next = currentNode.next;
					return true;
				}
				prev = currentNode;
				currentNode = currentNode.next;
			}

		}
		return false;

	}
/*
 * remove item at particular position
 */
	Boolean removeItemAtPos(int pos) {
		Node<T> prev = new Node<T>();
		int count = 0;
		currentNode = start.next;
		if (pos == 1) {

			// currentNode = start.next;
			start.next = currentNode.next;
			return true;
		} else {

			while (currentNode != null) {
				count++;
				if (count == pos) {
					System.out.println("remove");
					// prev=currentNode;
					prev.next = currentNode.next;
					return true;
				}
				prev = currentNode;
				currentNode = currentNode.next;
			}

		}
		return false;

	}
/*
 * retrieve item from particular index
 */
	T retriveItem(int index) {
		int count = 0;
		currentNode = start.next;
		if (index == 1) {

			return currentNode.data;
		} else {
			currentNode = start.next;
			while (currentNode.next != null) {
				count++;
				if (count == index) {

					return currentNode.data;
				}

				currentNode = currentNode.next;

			}

		}
		return currentNode.data;
	}
/*
 * reverse linked list
 */
	void reverseList() {

		if (start.next == null) {
			return;
		}
		Node<T> firstPointer = new Node<T>();
		Node<T> secondPointer = new Node<T>();
		currentNode = start.next;
		while (currentNode != null) {
			secondPointer = firstPointer;
			firstPointer = currentNode;
			currentNode = currentNode.next;
			secondPointer.next = secondPointer;

		}
		start.next = firstPointer;
		secondPointer.next=null;
	}

	/*
	 * void sorting() { Node<T> newNode = new Node<T>(); Node<T>a=new Node<T>();
	 * Node<T>b=new Node<T>(); T c; if (start.next == null) { return; } else {
	 * currentNode = start.next;
	 * for(a=currentNode;currentNode!=null;currentNode=currentNode.next) {
	 * for(b=currentNode.next;currentNode!=null;currentNode=currentNode.next) {
	 * if(a.data>b.data) { c=a.data; a.data=b.data; b.data=c; } }
	 * 
	 * }
	 * 
	 * }
	 */
	public static void main(String args[]) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		System.out.println("Enter first value");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		int data = sc.nextInt();
		a.add(data);

		System.out.println("Do you want to enter more values");
		String ch = sc.next();

		while (ch.equalsIgnoreCase("Yes")) {
			System.out.println("Enter data");
			data = sc.nextInt();
			a.add(data);

			System.out.println("Do you want to enter more values");
			ch = sc.next();

		}
		a.display();
		System.out.println("Enter position and item ");
		int pos = sc.nextInt();
		data = sc.nextInt();
		Boolean b = a.partiLoc(pos, data);
		if (b == false) {
			System.out.println("Position" + pos
					+ " is not present in linked list");
		}
		a.display();
		System.out.println("Enter position which item you want to remove ");
		pos = sc.nextInt();
		b = a.removeItemAtPos(pos);
		if (b == false) {
			System.out.println("Position" + pos
					+ " is not present in linked list");
		}
		a.display();
		System.out.println("Enter item which you want to remove ");
		data = sc.nextInt();
		b = a.removeItem(data);
		if (b == false) {
			System.out.println("Given item" + data
					+ " is not present in linked list");
		}
		a.display();
		System.out.println("Enter index on which item require ");
		int index = sc.nextInt();

		data = a.retriveItem(index);
		System.out.println("Item on index" + index + "is" + data);
		a.reverseList();
		a.display();

	}
}