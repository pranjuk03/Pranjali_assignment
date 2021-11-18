package javaAssignment2_organization;

public class Labour extends Employee{
	int overtime=3;
	@Override
	void salary()
	{
		int sal;
		sal=8000+(3*200);
		System.out.println("The salary of a Labour is Rs:" +sal);
	}

}
