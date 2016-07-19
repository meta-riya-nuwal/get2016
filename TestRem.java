import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRem {

	@Test
	public void testMessageutil() {
		Rem r = new Rem();
		assertEquals(0, r.rem(6, 2));
		assertEquals(-1, r.rem(2, 0));
		assertEquals(1, r.rem(100, 3));

	}

}
