import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFirst {

	

	@Test
	public void testMessageutil() {
		First f=new First();
		assertEquals(65,f.convertBinaryToOctal(110101));
		assertEquals(32,f.convertBinaryToOctal(11010));
	}

}