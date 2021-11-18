package javaAssignment5_generic;

public class Employee {
	int id;
	String name;
	String dept;
	int salary;
	
		
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee Details [id=" + id + ", name=" + name + ", dept=" +dept +",salary=" + salary + "]";
	}

	public void displayDetails()
	{
		this.toString();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+dept);
	}
}
