package tictoe;

public class Result {

	int checkResult(int row, int col, String state[][], String sign) {
		int count = 0;
		/*
		 * Check for vertical column 
		 */
		for (int i = 0; i < 3; i++) {
			if (state[row][i].equals(sign)) {
				count++;
				if (count == 3) {
					System.out.println("Winner is " + sign);
					return 1;
				}

			}
		}
		count = 0;
		/*
		 * Check for row 
		 */
		for (int i = 0; i < 3; i++) {
			if (state[i][col].equals(sign)) {
				count++;

				if (count == 3) {
					System.out.println("Winner is " + sign);

					return 1;
				}

			}
		}
		count = 0;
		/*
		 * check for diagonal
		 */
		for (int i = 0; i < 3; i++) {
			if (state[i][i].equals(sign)) {
				count++;
				if (count == 3) {
					System.out.println("Winner is " + sign);
					return 1;
				}

			}
		}
		count = 0;
		int j = 2;
		/*
		 * check for opposite diagonal
		 */
		for (int i = 0; i < 3; i++) {
			if (state[i][j].equals(sign)) {
				count++;
				j--;
				if (count == 3) {
					System.out.println("Winner is " + sign);
					return 1;
				}

			}
		}
		return 0;
	}
}
