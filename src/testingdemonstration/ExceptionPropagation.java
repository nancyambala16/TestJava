package testingdemonstration;

import java.io.IOException;

public class ExceptionPropagation {

	void m() 
	{
		System.out.println("M method");
		try {
			throw new IOException("Divide by zero");
		}
		catch (IOException e) {
			System.out.println("Handled ");
		}
	}

	void n() 
	{
		m();
	}

	void p() throws IOException
	{
		throw new IOException("Throwing Exception");
	}

	void p1() 	{
		throw new ArithmeticException("Throwing Exception");
	}

	public static void main(String[] args) throws IOException
	{

		ExceptionPropagation ep=new ExceptionPropagation();
		ep.n();


	}

}

/*1. if we throw checked exception then it must be caught in all the calling methods using throws keyword
and must be handled using try-catch block in the last calling method
2. if we throw checked exception and handling using try catch batch in the called method then no need to
propagate in calling method
3. If we declare the unchecked exception in parent class then child can have same exception 
or no exception or childclass exception
4.  if we declare the checked exception in parent class same needs to be declare in child class and
 it must be handled using try-catch block in the last calling method
 if we try to run same thread twice it will give illegalThreadStateException
 */