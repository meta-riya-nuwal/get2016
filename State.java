package tictoe;

import java.util.*;

public class State {

	Scanner sc = new Scanner(System.in);

	String[][] calculateState(int row, int col, String Sign, String state[][]) {

		System.out.print("sign is" + Sign);
		state[row][col] = Sign;

		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(state[i][j]);
			}
			System.out.println();
		}
		return state;

	}

}
