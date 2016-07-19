import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestGcd {

	@Test
	public void testMessageutil() {
		Gcd r = new Gcd();
		assertEquals(2, r.findGcd(2,0));
		assertEquals(3, r.findGcd(12,18));
		assertEquals(1, r.findGcd(100, 3));

	}

}
