package session8;

public class QuickSort {

	int[] quickSort(int a[], int start, int end) {
		if (end - start <= 0) {

			return a;
		} else {

			int pos = part(a, start, end);

			quickSort(a, start, pos - 1);
			quickSort(a, pos + 1, end);

		}
		return a;
	}

	private int part(int a[], int start, int end) {
		int t;
		int key = a[start];

		while (true) {
			while (a[start] < key && start >= 0 && a[start] != key) {
				start = start + 1;
			}

			while (a[end] > key && a[end] != key) {
				end = end - 1;// ;./ k
			}
			if (a[start] == a[end] && a[end] == key) {
				start = end;

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
