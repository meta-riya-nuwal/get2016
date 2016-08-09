package session8;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTreesort {

	@Test
	public void testMessageutil() {
		BinarySort binary = new BinarySort();
		int array[] = { 1, 34, 56, 23, 2, 3 };
		binary.insertElement(array);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(23);
		al.add(34);
		al.add(56);
		assertEquals(al, binary.treesort());

	}

}
