package lambaExp;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String name;
	int salary;
	int age;

	Employee(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}

public class PredImp3 {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee("nancy", 19, 40000));
		list.add(new Employee("nancy1",25, 50000));
		list.add(new Employee("nancy", 19, 30000));
		list.add(new Employee("nancy", 18, 50000));
		Predicate<Employee> pr=i->(i.age>18&&i.salary>=40000);
		for(Employee e1:list)
		{
			if(pr.test(e1))
			{
				System.out.println(e1.name+" : "+e1.age+" : "+e1.salary);
			}
		}
	}
}
