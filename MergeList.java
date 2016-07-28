package Single;

import java.util.*;
import java.util.Scanner;

public class MergeList {

	
	/*
	 * Merge two ArrayList
	 */
	public static void main(String args[]) {
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value for firstList");

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
		System.out.println("Enter first value for secondList");

		System.out.println("enter values");
		data = sc.nextInt();
		a.add(data);

		System.out.println("Do you want to enter more values");
		ch = sc.next();

		while (ch.equalsIgnoreCase("Yes")) {
			System.out.println("Enter data");
			data = sc.nextInt();
			b.add(data);

			System.out.println("Do you want to enter more values");
			ch = sc.next();

		}

		int bcount = b.getSize();

		Object list2[] = b.getElements();

		for (int i = 0; i < bcount; i++) {
			a.add(list2[i]);
		}

		a.display();

	}
}
