package lambaExp;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredImp4 {
	
	public static void main(String[] args) {
	
		ArrayList<Employee1> list=new ArrayList<>();
		list.add(new Employee1("Nancy G", 19, 40000));
		list.add(new Employee1("Nancy Gupta",25, 50000));
		list.add(new Employee1("nancy", 19, 30000));
		list.add(new Employee1("nancy", 18, 50000));
		Predicate<Employee1> pr=i->(i.age>18&&i.salary>=40000);
		for(Employee1 e1:list)
		{
			if(pr.test(e1))
			{
				System.out.println(e1.name+" : "+e1.age+" : "+e1.salary);
			}
		}
	}

}
/*
 
Predicate is an Anonymous Functions
Nameless,no return type,no access modifier
used to provide functional programming feature
used for code reusability

Used with Functional Interfaces
Predicate,Function,consumer,supplier---predefined Functional Interfaces
Predicate --predefined Functional Interface having SAM 
public boolean test(T t)--used for conditional checks-return only boolean value ie T/F

interface Function<T,R>
public R apply(T);---take some input and provide output

consumer<T>-it just accept the input but does not return any value
public void accept(T t)
supplier<R>-does not take any input but provide the output
public R get()

*/
