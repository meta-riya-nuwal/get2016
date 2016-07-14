import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMerge {

	@Test
	public void testMessageutil() {
		Merge f = new Merge();
		int a[] = { 1, 2, 5 };
		int b[] = { 3, 4, 7, 8 };
		int c[] = new int[100];
		int d[] = { 1, 2, 3, 4, 5, 7, 8 };
		assertArrayEquals(d, f.join(a, a.length, b, b.length, c));

	}

}
