public class Gcd {

	int findGcd(int x, int y) {
		if (x == 0)
			return y;
		else if (y == 0)
			return x;
		else if (x < y) {
			return findGcd(x, y % x);
		} else {
			return findGcd(x % y, y);
		}

	}

}
