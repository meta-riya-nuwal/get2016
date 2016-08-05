package data_struct;

import java.util.*;

public class SortedLinkedList {

	LinkedList<Integer> list = new LinkedList();
	int position = 0;

	int addElementsSorted() {

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		return list.size();
	}
/*
 * recursively check that where element is inserted in sorted linked list and then insert
 */
	int addElement(int size, int data, int index) {
		if (index >= size) {
			position = size;
			list.add(position, data);
			return size;
		} else {
			int val = (int) list.get(index);
			if (val < data) {

				addElement(size, data, index + 1);
			} else {

				position = index;
				list.add(position, data);
				return index;
			}
		}
		return position;
	}
/*
 * It will display all list 
 */
	void displayList() {
		Object ls[] = list.toArray();
		for (int i = 0; i < ls.length; i++) {
			System.out.println(ls[i]);
		}
	}

	public static void main(String args[]) {
		SortedLinkedList st = new SortedLinkedList();
		int size = st.addElementsSorted();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		int data = sc.nextInt();
		int index = 0;
		st.addElement(size, data, index);
		st.displayList();
	}
}
