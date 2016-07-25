package tictoe;

public class Space {

	/*
	 * how many space is remaining
	 */
	int calculateSpace(String state[][]) {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (state[i][j].equals("_")) {

				} else {
					count++;
				}
			}
		}
		return count;

	}
}
