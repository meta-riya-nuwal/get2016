package tictoe;

import java.util.Scanner;

public class tictoe {

	public static void main(String args[]) {

		System.out.println("Welcome game of tictactoe for two players");
		System.out.println("Enter player sign for first player");
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		System.out.println("Enter player sign for second player");
		String second = sc.next();
		PlayerSign ps = new PlayerSign(first, second);
		PlayGame pg = new PlayGame();
		String firstsign = ps.getFirstSign();

		String secondSign = ps.getSecondSign();
		int res = pg.play(firstsign, secondSign);
		System.out.print(res);
		
		if (res == 0)
			System.out.print("Match is draw");

	}
}
