public class Patttern1 {

	String space(int row, int n) { //calculate spaces
		String sp = "";
		int no = n - row - 1;
		for (int i = 0; i < no; i++) {
			sp = sp + " ";
		}

		return sp;
	}

	String number(int row) { //calculate number
		String num = "";
		String num1 = "";
		int k = 0;
		for (int i = 0; i < row + 1; i++) {

			num1 = Integer.toString(++k);
			num = num + num1;

		}

		return num;
	}

	String[] printPyramid(int n) { //print pyramid
		String s = "", s1 = "";
		n = n + 1;
		String Pattern[] = new String[n];
		int i = 0;

		int p = n - 1;
		int l = n - 1;
		int k = i;

		for (int j = 0; j < n; j++) { //loop for printing

			s = space(p, n);
			p = p - 1;
			Pattern[k] = s;

			s1 = number(--l);

			Pattern[k] = s + s1;

			s = "";
			s1 = "";
			k++;
		}

		return Pattern;

	}

}
