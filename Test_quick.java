import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_quick {

	@Test
	public void testMessageutil() {

		Quick_sort r = new Quick_sort();

		int a[] = { 5, 4, 3, 5, 1 };
		int b[] = { 1, 3, 4, 5, 5 };
		int start = 0;
		assertArrayEquals(b, r.quick(a, start, a.length - 1));

	}

}
