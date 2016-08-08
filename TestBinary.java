package session7;
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
		int a[]={1,2,3,3,4};

		assertEquals(-1, r.doBinarySearch(a,0,a.length-1,7));
		
	}
	
	public void test() {
		Binary r = new Binary();
		int a[]={2,3,3,6,7};
		assertEquals(1, r.doBinarySearch(a,0,a.length-1,3));
	}
}
