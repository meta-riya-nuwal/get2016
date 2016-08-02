public class Remove_dupli {

	int[] remove_dupli(int a[]) {
		int f = 0, k = 0, j;
		int out[] = new int[a.length];
		for (int i = 0; i < a.length - 1; i++) {
			f = 0;

			for (j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					f = 1;
				}
			}
			if (f == 0) {
				out[k++] = a[j];

			}

		}
		int out1[] = new int[k];
		int l = 0;
		for (int i = 0; i < k; i++) {
			out1[l] = out[i];
			l++;
		}
		return out1;

	}

	
}
