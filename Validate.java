package tictoe;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Validate {

	int check(String row) {
		int inputNumber;

		try {

			inputNumber = Integer.parseInt(row);

		} catch (Exception ex) {

			System.out.println("invalid input:");
			Scanner sc = new Scanner(System.in);
			row = sc.next();
			inputNumber = check(row);
		}

		return inputNumber;
	}

	List<Integer> validateArray(int row, int col, String Sign, String[][] state) {
		List<Integer> ls = new ArrayList<Integer>();
		PlayGame pg = new PlayGame();
		try {
			while (true) {
				if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
					System.out.print("row is" + row);
					ls.add(row);
					ls.add(col);
					return ls;

				} else {
					System.out
							.print("Position is out of bound reeneter positions");
					Scanner sc = new Scanner(System.in);
					String rows = sc.next();
					row = check(rows);
					String cols = sc.next();

					col = check(cols);

					// System.out.println(row+"j");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	List<Integer> validateOccupied(int row, int col, String sign,
			String state[][]) {
		List<Integer> ls = new ArrayList<Integer>();
		while (true) {
			if (state[row][col].equals("_")) {
				System.out.print("row is" + row);
				ls.add(row);
				ls.add(col);
				return ls;
			}

			else {

				System.out
						.print("Position is already occupied reenter another position");
				Scanner sc = new Scanner(System.in);
				String rows = sc.next();
				row = check(rows);
				String cols = sc.next();

				col = check(cols);

			}

		}

	}
}
