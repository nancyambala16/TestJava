package lambaExp;

import java.util.function.Predicate;

public class PredImp2 {

	public static void main(String[] args) {
		
		Predicate<Integer> p1=i->(i%2==0&&i>=50);
		int a[]= {2,5,10,50,60,54};
		for(int n:a)
		{
			if(p1.test(n))
			{
				System.out.println(n);
			}
		}
		
		System.out.println("*************************");
		Predicate<Integer> pr=i->(i%2==0);
		Predicate<Integer> pr1=i->(i>50);

		int b[]= {2,5,10,50,60,54,66};
		for(int n:b)
		{
			if(pr1.and(pr).test(n))
			{
				System.out.println(n);
			}
		}
		
	}
}
