package Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Prog3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose between following options:");
		System.out.println("1.ID|2.Name|3.Department|4.Salary");
		int choose=sc.nextInt();
		TreeSet<Employee> emp=null;
		switch(choose)
		{
			case 1: emp=new TreeSet<>(new IdComp());
					break;
			case 2: emp=new TreeSet<>(new NameComp());
					break;
			case 3:	emp=new TreeSet<>(new DeptComp());
					break;
			case 4: emp=new TreeSet<>(new SalComp());
					break;
			default:System.out.println("Invalid Option");
		}
		emp.add(new Employee(10,"Naruto","IT",2000));
		emp.add(new Employee(11,"Luffy","Management",2200));
		emp.add(new Employee(12,"Goku","HR",1800));
		emp.add(new Employee(13,"Madara","Management",1900));
		emp.add(new Employee(14,"Itachi","HR",2100));
		emp.add(new Employee(16,"Vegeta","Training",2400));
		emp.add(new Employee(15,"Karma","IT",2000));
		emp.add(new Employee(19,"Leleouch","IT",2300));
		emp.add(new Employee(17,"Minato","HR",1900));
		emp.add(new Employee(18,"Gohan","Management",1700));
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}


}
