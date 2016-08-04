package data_struct;

import java.util.LinkedList;
import java.util.*;

public class SortedLinkedList {

	LinkedList l = new LinkedList();
	int pos = 0;

	int addElementsSorted() {

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		return l.size();
	}
/*
 * recursively check that where element is inserted in sorted linked list and then insert
 */
	int addElement(int size, int data, int index) {
		if (index >= size) {
			pos = size;
			l.add(pos, data);
			return size;
		} else {
			int val = (int) l.get(index);
			if (val < data) {

				addElement(size, data, index + 1);
			} else {

				pos = index;
				l.add(pos, data);
				return index;
			}
		}
		return pos;
	}
/*
 * It will display all list 
 */
	void displayList() {
		Object ls[] = l.toArray();
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
