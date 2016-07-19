import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testsearch {

	@Test
	public void testMessageutil() {
		Linear_search r = new Linear_search();
		int a[]={2,4,5,6,7};
		int num=7;
		assertEquals("Found", r.Search(a,0,num));
		assertEquals("Not Found", r.Search(a,0,num));

	}

}
