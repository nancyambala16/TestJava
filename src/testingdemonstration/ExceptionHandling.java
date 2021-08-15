package testingdemonstration;

import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		int i=0;
		try
		{
			i=10/0;
		}
		catch(ArithmeticException e)
		{
			try
			{
				i=20/0;
			}
			catch(ArithmeticException ear)
			{
				System.out.println("Inside catch"+ear.getMessage());

			}

		}

		try {
			throw new IOException("Nancy");
		}
		catch(Exception ear)
		{
			System.out.println("In last Catch "+ear.getMessage());
			ear.printStackTrace();
		}	
	}
}