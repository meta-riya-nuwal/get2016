
public class Binary {

	String Search(int a[], int low, int high, int num) {
		int flag = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				flag = 1;
			} else {
				flag = 0;
			}
		}
		if (flag == 0)
			throw new IllegalArgumentException(
					"Elememts are not in sorted order");

		int mid = (low + high) / 2;
		if (low > high)
			return "not found";
		else if (num == a[mid])
			return "found";
		else if (num < mid)
			return Search(a, low, mid - 1, num);
		else
			return Search(a, mid + 1, high, num);

	}

	
}
