import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;

public class TestPermutation {

	@Test
	public void testMessageutil() {

		Permutation t = new Permutation();

		ArrayList<String> al = new ArrayList<String>();
		al.add("BCA");
		al.add("CBA");
		al.add("CAB");
		al.add("ACB");
		al.add("BAC");
		al.add("ABC");
		char b[] = { 'A', 'B', 'C' };
		ArrayList<String> out = t.perm(b, b.length);
		Boolean t1 = al.containsAll(out);
		if (t1 == true) {
			assert (t1);
		}
	}

}
