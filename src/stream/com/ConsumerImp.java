package stream.com;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import lambaExp.Employee1;

public class ConsumerImp {

	public static void main(String[] args) {

		Consumer<String> con=c->System.out.println(c);
		con.accept("Hello");

		ArrayList<Employee1> list=new ArrayList<>();
		list.add(new Employee1("Nancy G", 19, 40000));
		list.add(new Employee1("Nancy Gupta",25, 60000));
		list.add(new Employee1("nancy", 19, 30000));
		list.add(new Employee1("nancy", 18, 50000));

		Function<Employee1,Integer> fn=i->{
			if (i.age>18)
				return i.salary*10;
			else 
				return -1;
		};

		Predicate<Integer> pr=i->(i>300000);

		Consumer<Employee1> cons=emp->System.out.println(emp.name+" : "+emp.age+" : "+emp.salary);


		for(Employee1 e1:list)
		{
			int bonus=fn.apply(e1);
			if(pr.test(bonus))
			{
				cons.accept(e1);	
				System.out.println("Bonus is : "+bonus);
			
			}
		}

        list.stream().filter(n->n.salary>3000).map(n->n.salary+1000).forEach(n->System.out.println(n));




	}

}
