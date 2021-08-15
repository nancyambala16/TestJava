package testingdemonstration;

import java.io.IOException;

public class ExceptionPropagation2 {
	
	void m()
	{
		System.out.println("M method");
		throw new ArithmeticException("Divide by zero");
	}

	void n() 
	{
		m();
	}
	
	public static void main(String[] args) 
{
		
		ExceptionPropagation2 ep=new ExceptionPropagation2();
				ep.n();
		
	}
	
}
