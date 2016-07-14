import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testlongest {

	@Test
	public void testMessageutil() {
		Longest c = new Longest();
		int a[] = {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9 };
		int d[]={1, 2,4,5,6,7,8,9};
		assertArrayEquals(d, c.longestSequence(a));

	}

}
