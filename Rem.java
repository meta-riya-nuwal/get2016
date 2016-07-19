public class Rem {

	int rem(int x, int y) {
		if (y == 0)
			return -1;

		if (x < y) {
			return x;
		} else {
			return rem(x - y, y);
		}
	}

	

}
