package Single;

import java.util.Scanner;

public class DoublyLinkedList<T> {
	NodeDouble<T> start = new NodeDouble<T>();
	NodeDouble<T> currentNode = null;

	void add(T value) {
		NodeDouble<T> newNode = new NodeDouble<T>();
		newNode.data = value;

		if (start.next == null) {
			start.next = newNode;
			newNode.previous = start;
		} else {
			currentNode = start.next;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.previous = currentNode;
		}
		newNode.next = null;
	}

	void display() {
		currentNode = start.next;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

	void traverseBack() {
		currentNode = start.next;
		while (currentNode.next != null) {

			currentNode = currentNode.next;
		}

		while (currentNode.previous != null) {

			System.out.println(currentNode.data);
			currentNode = currentNode.previous;
		}
	}

	Boolean partiLoc(int loc, T value) {
		int count = 1;
		NodeDouble<T> newNode = new NodeDouble<T>();

		newNode.data = value;
		if (loc == 1) {
			currentNode = start.next;
			newNode.previous = start.next;
			newNode.next = currentNode;
			start.next = newNode;

			return true;
		} else {
			currentNode = start.next;
			while (currentNode.next != null) {

				if (count == loc - 1) {
					newNode.next = currentNode.next;
					newNode.previous = currentNode;
					currentNode.next = newNode;

					return true;
				}

				currentNode = currentNode.next;
				count++;
			}

		}
		return false;
	}

	Boolean removeItemAtPos(int pos) {
		NodeDouble<T> prev = new NodeDouble<T>();
		int count = 0;
		currentNode = start.next;
		if (pos == 1) {

			// currentNode = start.next;
			start.next = currentNode.next;
			currentNode.previous = start;
			return true;
		} else {

			while (currentNode != null) {
				count++;
				if (count == pos) {
					System.out.println("remove");
					// prev=currentNode;
					prev.next = currentNode.next;
					currentNode.next.previous = prev;
					return true;
				}
				prev = currentNode;
				currentNode = currentNode.next;
			}

		}
		return false;
	}

	Boolean removeItem(T value) {
		NodeDouble<T> prev = new NodeDouble<T>();

		currentNode = start.next;
		if (currentNode.data == value) {

			// currentNode = start.next;
			start.next = currentNode.next;
			currentNode.previous = start;
			return true;
		} else {

			while (currentNode.next != null) {
				if (currentNode.data == value) {
					prev.next = currentNode.next;
					currentNode.next.previous = prev;
					return true;
				}
				prev = currentNode;
				currentNode = currentNode.next;
			}

		}
		return false;

	}

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

	public static void main(String args[]) {
		DoublyLinkedList<Integer> a = new DoublyLinkedList<Integer>();
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
		System.out.println("Traverse backtrack");
		a.traverseBack();
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
	}
}
