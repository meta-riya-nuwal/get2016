import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPattern {

	@Test
	public void testMessageutil() {
		Pattern c = new Pattern();

		String b[] = c.printPyramid(5);

		String a[] = { "    1", "   121", "  12321", " 1234321", "123454321",
				" 1234321", "  12321", "   121", "    1" };

		for (int i = 0; i < 9; i++) {
			assertEquals(a[i], b[i]);
		}
		String space[] = { "    ", "   ", "  ", " ", "" };//match spaces
		for (int i = 0; i < 5; i++) {
			String sp = c.space(i, 5);
			assertEquals(space[i], sp);
		}
		String number[] = { "1", "121", "12321", "1234321", "123454321" }; //match the number
		for (int i = 0; i < 5; i++) {
			String no = c.number(i);
			assertEquals(number[i], no);
		}

	}

}
