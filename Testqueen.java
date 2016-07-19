import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;

public class Testqueen {

	@Test
	public void testMessageutil() {

		Queens t = new Queens();

		int index[] = new int[4 + 1];
		int result[][] = new int[4 + 1][4 + 1];
		int result1[][] = t.queen(1, 4, index, result);
		int expected[][]={ {0,0,1,0},{1,0,0,0},{0,0,0,1},{0,1,0,0} };
		
		assertArrayEquals(expected,result1);
		
	}

}
