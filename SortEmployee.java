package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class SortEmployee{

	
	void nameComparator(HashMap<Integer,Employee> emp)
	{
		ArrayList<Employee> empList=new ArrayList<Employee>();
		for (Entry<Integer, Employee> s : emp.entrySet()) {
			
			
			empList.add(s.getValue());
			
		}
		Collections.sort(empList,new NameCompare());
		System.out.println("Sorting according to name.....");
		System.out.println(empList);
	}
	
	class NameCompare implements Comparator<Object>
	{
	
		public int compare(Object o1,Object o2)
		{
			Employee e1=(Employee)o1;
			Employee e2=(Employee)o2;
			 return e1.getName().compareTo(e2.getName());
		}
	}
}
