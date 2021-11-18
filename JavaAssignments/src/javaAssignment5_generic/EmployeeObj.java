package javaAssignment5_generic;

import java.util.HashSet;
import java.util.Set;

public class EmployeeObj {
	public static void main(String[] args) {
		Set<Employee> emp=new HashSet<>();
		emp.add(new Employee(101,"Shuaib","Developer",21000));
		emp.add(new Employee(11,"Mani","Tester",15000));
		emp.add(new Employee(18,"Prince","HR",17000));
		
		for(Employee e : emp)
		{
			System.out.println(e);
		}
		
	}
}
