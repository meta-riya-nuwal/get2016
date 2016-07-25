package tictoe;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {

	Validate v = new Validate();
	int result = 0;
	int space = 0;
	String state[][] = new String[3][3];
	int num = 9;
	State st = new State();

	Result r = new Result();
	Space sp = new Space();

	/*
	 * Intilialized to all values by "_"
	 */
	PlayGame() {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				state[i][j] = "_";
			}
		}
	}

	int play(String firstSign, String secondSign) {
		Validate v = new Validate();
		Scanner sc = new Scanner(System.in);
		/*
		 * Chance for first player
		 */
		if (space < num) {

			System.out.print("Enter row and column for first player ");
			String rows = sc.next();
			int row = v.check(rows);
			String cols = sc.next();

			int col = v.check(cols);

			/*
			 * Validates that array are not out of bound
			 */
			List<Integer> ls = v.validateArray(row, col, firstSign, state);
			row = ls.get(0);
			col = ls.get(1);
			/*
			 * Validates that position is not already occupied
			 */
			List<Integer> ls1 = v.validateOccupied(row, col, firstSign, state);
			row = ls1.get(0);
			col = ls1.get(1);
			/*
			 * State is return for each new position
			 */

			state = st.calculateState(row, col, firstSign, state);
			/*
			 * for every state it checks that player is winner or not
			 */
			result = r.checkResult(row, col, state, firstSign);
			if (result == 1) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(state[i][j]);
					}
					System.out.println();
				}
				System.exit(0);

				// return 1;
			}
			space = sp.calculateSpace(state);
		} else {
			return 0;
		}
		/*
		 * Chance for second player
		 */
		if (space < num) {

			System.out.print("Enter row and column for second player ");
			String rows = sc.next();
			int row = v.check(rows);
			String cols = sc.next();

			int col = v.check(cols);

			List<Integer> ls = v.validateArray(row, col, secondSign, state);
			row = ls.get(0);
			col = ls.get(1);
			List<Integer> ls1 = v.validateOccupied(row, col, secondSign, state);
			row = ls1.get(0);
			col = ls1.get(1);

			state = st.calculateState(row, col, secondSign, state);
			result = r.checkResult(row, col, state, secondSign);
			if (result == 1) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(state[i][j]);
					}
					System.out.println();
				}
				System.exit(0);
				// return 1;
			}

			space = sp.calculateSpace(state);
			play(firstSign, secondSign);
		} else {
			return 0;
		}
		return 0;
	}
}
