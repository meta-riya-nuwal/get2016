public class Pattern {

	String space(int row, int n) { //Calculate space
		String sp = "";
		int no = n - row - 1;
		for (int i = 0; i < no; i++) {
			sp = sp + " ";
		}

		return sp;
	}

	String number(int row) {  //calculate string of number
		String num = "";
		String num1 = "";
		int k = 0;
		for (int i = 0; i < row + 1; i++) {

			num1 = Integer.toString(++k);
			num = num + num1;

		}

		for (int i = 0; i < row; i++) {
			num1 = Integer.toString(--k);
			num = num + num1;
		}

		return num;
	}

	String[] printPyramid(int n) {   //preint pyramid
		String s = "", s1 = "";
		String Pattern[] = new String[n * 2 - 1];
		int i = 0;
		for (i = 0; i < n; i++) {   //print upper triangle
			s = space(i, n);
			Pattern[i] = s;
			s1 = number(i);
			Pattern[i] = s + s1;
			s = "";
			s1 = "";

		}
		int p = n - 2;
		int l = n - 1;
		int k = i;

		for (int j = 0; j < n - 1; j++) {  //print lower triangle

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
