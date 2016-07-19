import java.util.ArrayList;

public class Permutation {

	ArrayList<String> al = new ArrayList<String>();

	ArrayList<String> perm(char[] a, int n) {
		if (n == 1) {
			// System.out.println(a);

			String out = new String(a);

			al.add(out);
			out = "";

			return al;
		}
		for (int i = 0; i < n; i++) {
			swap(a, i, n - 1);
			// System.out.println(a);
			perm(a, n - 1);
			swap(a, i, n - 1);
			// System.out.println(a);
		}
		return al;
	}

	void swap(char[] a, int i, int j) {
		char c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

}