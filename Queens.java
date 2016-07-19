public class Queens {

	
	
	
	
	//it decides that queen can be placed at current position or not
	int place(int row, int column, int index[]) {
		for (int i = 1; i < row; i++) {
			if ((index[i] == column || (Math.abs(row - i) == Math.abs(column //check for diagonal values
					- index[i])))) {
				return 0;
			}
		}
		return 1;
	}

	public int[][] queen(int currentRow, int totalRow, int index[], int q[][]) {

		// check all the possible place for queen at current row
		for (int i = 1; i <= totalRow; i++)

		{
			if (place(currentRow, i, index) == 1)

			{
				index[currentRow] = i;

				// Base condition and get result for each row
				if (currentRow == totalRow) {

					int pos = 1;

					for (int k = 1; k <= 4; k++) {
						for (int j = 1; j <= 4; j++) {

							q[k][j] = 0;
							if (index[k] == j) {
                  //place the queen position 
								q[k][j] = 1;

							}

						}

					}

					return q;

				}
				// if more number of row present then check solution for then

				else {

					queen(currentRow + 1, totalRow, index, q);

				}

			}

		}

		return q;
	}

	public static void main(String[] args) {

		Queens nQueen = new Queens();

		// define size of array according to board size
		int index[] = new int[4 + 1];
		int result[][] = new int[4 + 1][4 + 1];
		int result1[][] = new int[4 + 1][4 + 1];

		// Call method to get all possible solution
		result1 = nQueen.queen(1, 4, index, result);

		// show all the possible solutions;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(result1[i][j]);
			}
			System.out.println();
		}

	}

}
