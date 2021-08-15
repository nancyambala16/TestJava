package lambaExp;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionImp {

	public static void main(String[] args) {

		Function<Integer,Integer> f=i->i*i;
		Function<Integer,Integer> f2=i->i*2;
        System.out.println(f.andThen(f2).apply(2));
        System.out.println(f.compose(f2).apply(2));

		
		System.out.println(f.apply(4));

		Function<String,Integer> f1=i->i.length();
		System.out.println(f1.apply("nancy gupta"));

		ArrayList<Employee1> list=new ArrayList<>();
		list.add(new Employee1("Nancy G", 19, 40000));
		list.add(new Employee1("Nancy Gupta",25, 50000));
		list.add(new Employee1("nancy", 19, 30000));
		list.add(new Employee1("nancy", 18, 50000));

		Function<Employee1,Integer> fn=i->{
			if (i.age>18)
				return i.salary*10;
			else 
				return -1;
		};

		Predicate<Integer> pr=i->i>300000;

		for(Employee1 e1:list)
		{
			int bonus=fn.apply(e1);
			if(pr.test(bonus))
			{
				System.out.println(e1.name+" : "+e1.age+" : "+e1.salary+" : "+bonus);
			}
		}
	}
}
