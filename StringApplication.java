package session6;

import java.util.Scanner;

public class StringApplication {

	public static void main(String args[]) {
		StringUnique unique = new StringUnique();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String string;
		String ch;
		do {
			System.out.println("Enter string");

			string = sc.nextLine();

			unique.calculateUnique(string);
			System.out
					.println("Can you want to enter more detail say y for yes");
			ch = sc.next();
			sc.nextLine();
		} while (ch.equals("y"));

	}
}
