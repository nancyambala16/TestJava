package lambaExp;

import java.util.function.Predicate;

public class PredicateImp {

	public static void main(String[] args) {
	
		Predicate<Integer> pr=i->(i>10);
		System.out.println(pr.test(10));
		
	   
		Predicate<String> pr1=i->(i.length()>4);
		
		
		String names[]= {"bob","nancy","ansh","gupta"};
		
		for(String name:names)
		{
			if(pr1.test(name))
			{
				System.out.println(name);
			}
		}
			
		
	}

}
