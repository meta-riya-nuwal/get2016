package session8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSorting {

	@Test
	public void testMessageutil() {
		int array[] = { 4, 3, 6, 8, 10, 45 };
		int output[] = { 3, 4, 6, 8, 10, 45 };
		if (array.length < 10) {
			System.out.println("Bubble sort...");
			BubbleSort bubble = new BubbleSort();
			int out[] = bubble.bubbleSort(array);

			assertArrayEquals(output, out);
		} else {
			System.out.println("Quick sort...");
			QuickSort quick = new QuickSort();
			int out[] = quick.quickSort(array, 0, array.length - 1);
			assertArrayEquals(output, out);

		}
		RadixSort radix = new RadixSort();
		CountSort count = new CountSort();
		int max = count.findMax(array);
		int digit = radix.countDigit(max);
		if (digit > 2) {
			System.out.println("Radixsort...");
			int out[] = radix.radixSort(array);
			assertArrayEquals(output, out);
		} else {
			System.out.println("Count sort...");
			int out[] = count.countSort(array);
			assertArrayEquals(output, out);
		}

	}

}
