import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestRemove {



	@Test
	public void testMessageutil() {
		Remove f=new Remove();
		int a[]={2,3,4,5,3,5,6,7};
		int b[]={2,3,4,5,6,7};
		assertArrayEquals(b,f.removeDuplicate(a));
		
	}

}
