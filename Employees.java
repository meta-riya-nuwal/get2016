package session6;

import java.util.*;
public class Employees {

	
	
	public static void main(String args[])
	{
		
		Employee emp=new Employee();
		SortEmployee sortEmp=new SortEmployee();
		HashMap<Integer, Employee> employee=emp.enterEmployeeDetails();
		System.out.println("Sorting...");
		emp.naturalOrderSort(employee);
		sortEmp.nameComparator(employee);
	}
}
