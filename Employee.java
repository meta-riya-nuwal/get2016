package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Employee implements Comparable<Object>{

	String name, address;
	int empId;

	Employee() {

	}

	Employee(int emp, String empname, String add) {
		empId = emp;

		name = empname;
		address = add;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getEmpId() {
		return empId;
	}

	public String toString() {

		return this.getEmpId() + " " + this.getName() + " " + this.getAddress();
	}

	HashMap<Integer, Employee> enterEmployeeDetails() {
		HashMap<Integer, Employee> empList = new HashMap<Integer, Employee>();
		Employee employee;
		
	
		String ch;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employeeId");
			int empid= sc.nextInt();
			System.out.println("Enter employee name");
			@SuppressWarnings("resource")
			
			String name = sc.next();
			System.out.println("Enter employee address");
			String address = sc.next();
			
			if(empList.containsKey(empid))
			{
				System.out.println("Duplicate entry this Employee Id already registered");
				
			}
			else
			{
			employee = new Employee(empid, name, address);
			empList.put(empid, employee);
			}
			
			System.out
					.println("Can you want to enter more detail say y for yes");
			ch = sc.next();

		} while (ch.equals("y"));
		for (Entry<Integer, Employee> s : empList.entrySet()) {
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
		return empList;

	}
	void naturalOrderSort(HashMap<Integer,Employee> emp)
	{
		ArrayList<Employee> empList=new ArrayList<Employee>();
		for (Entry<Integer, Employee> s : emp.entrySet()) {
			
			
			empList.add(s.getValue());
			
		}
		Collections.sort(empList);
		System.out.println(empList);
	}
	
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return getAddress().compareTo(((Employee )o).getAddress());
		
	}

}
