public class Largest_digit {

	int max = 0;
	int rem;

	int find_large(int num) {

		if (num < 10) {
			return max;
		} else {
			rem = num % 10;
			if (max < rem) {
				max = rem;
			}
			return find_large(num / 10);
		}
	}

}