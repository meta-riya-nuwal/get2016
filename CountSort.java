package session8;

public class CountSort {

	int[] countSort(int array[]) {
		int j = 0;
		int max = findMax(array);
		int output[] = new int[array.length];
		int countArray[] = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			countArray[array[i]] = countArray[array[i]] + 1;

		}
		for (int i = 1; i < countArray.length; i++)
			countArray[i] += countArray[i - 1];

		for (int i = array.length - 1; i >= 0; i--)
			output[--countArray[array[i]]] = array[i];
		for (int i = 0; i < array.length; i++) {
			array[i] = output[i];

		}
		return array;
	}

	int findMax(int array[]) {
		int max = array[0];
		int position = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {

				max = array[i];
			}
		}

		return max;
	}

	public static void main(String args[]) {
		CountSort count = new CountSort();
		int array[] = { 1, 2, 5, 2, 10, 6 };
		count.countSort(array);
	}

}
