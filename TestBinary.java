import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBinary {

	@Test
	public void testMessageutil() {
		Binary r = new Binary();
		int a[]={2,4,5,6,7};

		assertEquals("found", r.Search(a,0,a.length-1,7));
		assertEquals("not found", r.Search(a,0,a.length-1,6));

	}

}
