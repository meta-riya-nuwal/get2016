package session8;

public class BubbleSort {

	int[] bubbleSort(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		return array;

	}

	int countDigit(int number) {
		int count = 0;
		while (number > 0) {

			number = number / 10;
			count++;
		}
		System.out.println(count);
		return count;
	}

	public static void main(String args[]) {
		BubbleSort bubble = new BubbleSort();
		int array[] = { 111, 12, 151, 34, 100, 00 };
		bubble.bubbleSort(array);
	}

}
