import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFcfs {

	@Test
	public void testMessageutil() {
		Fcfs c = new Fcfs();
		int Arrival_time[] = { 1, 5, 9, 25 };
		int Job_size[] = { 12, 7, 2, 5 };
		int a[][] = { { 1, 1, 0, 1, 12 }, { 2, 5, 8, 13, 19 },
				{ 3, 9, 11, 20, 21 }, { 4, 25, 0, 25, 29 } };
		for (int i = 0; i < Arrival_time.length; i++) {
			assertArrayEquals(a, c.FCFS(Arrival_time, Job_size));
		}

	}

}