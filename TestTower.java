import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
public class TestTower {

	@Test
	public void testMessageutil() {

		Tower_hanoi t=new Tower_hanoi();
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("A->B");
		al.add("A->C");
		al.add("B->C");
		al.add("A->B");
		al.add("C->A");
		al.add("C->B");
		al.add("A->B");
		
		ArrayList<String>out=t.steps("A","B","C",3);
Boolean t1=al.containsAll(out);
if(t1==true)
{
	assert(t1);
}
	}

}
