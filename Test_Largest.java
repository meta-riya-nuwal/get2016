import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_Largest {

	@Test
	public void testMessageutil() {
		Largest_digit r = new Largest_digit();
		

		assertEquals(4, r.find_large(1234));
		assertEquals(3, r.find_large(5673));//failed test case

	}

}
