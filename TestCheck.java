import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCheck {

	@Test
	public void testMessageutil() {
		Check c = new Check();
		int a[] = { 11, 10, 9, 8, 5 };
		int b[] = { 2,3,4,5,6 };
		int c1[] = { 11, 10, 9,12,13 };
		int d = 2,e=1,f=0;
		assertEquals(d, c.checkArray(a));
		assertEquals(e, c.checkArray(b));
		assertEquals(f, c.checkArray(c1));

	}

}

