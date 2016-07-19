public class Quick_sort {

	int[] quick(int a[], int start, int end) {
		if (end - start <= 0) {

			return a ;
		} else {

			int pos = part(a, start, end);

			quick(a, start, pos - 1);
			quick(a, pos + 1, end);

		}
		return a;
	}

	int part(int a[], int start, int end) {
		int t;
		int key = a[start];

		while (true) {
			while (a[start] < key && start >= 0 && a[start] != key) {
				start = start + 1;
			}

			while (a[end] > key && a[end] != key) {
				end = end - 1;
			}
			if (a[start] == a[end] && a[end] == key) {
				start = end;
				break;
			}
			if (start >= end) {
				break;
			} else {
				t = a[start];
				a[start] = a[end];
				a[end] = t;
				if (start == end) {
					break;
				}

			}
		}

		return start;

	}

}
