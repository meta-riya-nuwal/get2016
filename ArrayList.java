package Single;

import java.util.Scanner;

public class ArrayList {

	int f = 0;
	Object array[];
	Object array2[];
	 int count = 0;
	int max = 8;

	public ArrayList() {
		array = new Object[max];
	}

	void add(Object data) {
		int i = 0;
		if (count > max - 1) {
			/*
			 * If list become overflow then increase it size so it works as arrayList
			 */
			max = (max * 3 / 2) + 1;
			array2 = new Object[max];
			for (i = 0; i < count; i++) {

				array2[i] = array[i];

			}
			array2[i] = data;
			int j = i;

			array = array2;
			count = count + 1;
			f = 1;
		} else {

			array[count] = data;
			System.out.println("data is" + array[count] + "count" + count);
			++count;
		}
	}

	void display() {
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);

		}

	}

	Boolean partiLoc(int loc, Object data) {
		int i = 0;

		if (count == loc) {
			if (max <= count) {

				max = (max * 3 / 2) + 1;
				array2 = new Object[max];
				for (i = 0; i < count; i++) {

					array2[i] = array[i];

					System.out.println("data is" + array2[i] + "count" + i);
				}
				array2[i] = data;
				array = array2;
				count = count + 1;
			} else {
				array[count] = data;
				count = count + 1;
			}
			return true;
		}
		if (count > loc) {

			if (max <= count) {

				max = (max * 3 / 2) + 1;
				array2 = new Object[max];
				for (i = 0; i < count; i++) {

					array2[i] = array[i];

					System.out.println("data is" + array2[i] + "count" + i);
				}
				array = array2;

			}
			for (int j = count; j >= loc; j--) {
				array[j] = array[j - 1];
			}
			array[loc - 1] = data;
			count = count + 1;
			return true;
		}
		return false;

	}

	Boolean occurenceItemAfterPos(int pos, Object data) {
		for (int i = pos; i < count; i++) {
			if (array[pos] == data) {
				return true;
			}

		}
		return false;
	}

	int firstOccurenceOfitem(Object data) {
		for (int i = 0; i < count; i++) {
			if (array[i] == data) {
				return i + 1;
			}

		}
		return -1;
	}

	Boolean removeItemAtIndex(int pos) {
		if (pos > count) {
			return false;
		}
		for (int i = pos - 1; i < count - 1; i++) {
			array[i] = array[i + 1];

		}
		count = count - 1;
		return true;
	}

	void clearList() {
		count = 0;
	}

	void reverse() {
		int i = 0;
		Object c;
		int j = count - 1;
		while (i <= j) {
			c = array[i];
			array[i] = array[j];
			array[j] = c;
			i++;
			j--;

		}
	}

	void sort() {
		Object c;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (array[j].equals(array[j + 1])) {
					c = array[j];
					array[j] = array[j + 1];
					array[j + 1] = c;
				}
			}

		}
	}

	int getSize() {
		return count;
	}

	Object[] getElements() {
		Object ob[] = new Object[count];
		for (int i = 0; i < count; i++) {
			ob[i] = array[i];
		}
		return ob;
	}

	public static void main(String args[]) {
		ArrayList a = new ArrayList();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(20);
		a.add(80);
        a.add(90);
		a.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position and item ");
		int pos = sc.nextInt();
		int data = sc.nextInt();
		Boolean b = a.partiLoc(pos, data);
		if (b == false) {
			System.out.println("Position" + pos
					+ " is not present in array list");
		}
		a.display();

		System.out.println("Check at  position  occurence of item ");
		System.out.println("Enter position and item");
		pos = sc.nextInt();
		data = sc.nextInt();
		b = a.occurenceItemAfterPos(pos, data);
		if (b == false) {
			System.out.println("Item is not occur after this position");
		} else {
			System.out.println("Item is present");
		}
		System.out.println("Retrieve first occurence of item ");
		System.out.println("Enter item");
		data = sc.nextInt();
		int location = a.firstOccurenceOfitem(data);
		if (location == -1) {
			System.out.println("Item is not present");
		} else {
			System.out.println("Item is present at" + location);
		}
		System.out.println("Delete item at particular index ");
		System.out.println("Enter position");
		pos = sc.nextInt();

		a.removeItemAtIndex(pos);
		a.display();
		System.out.println("reverse of Arraylist");
		a.reverse();
		a.display();
		a.sort();
		a.clearList();
	}
}
