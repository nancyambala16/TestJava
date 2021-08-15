package testingdemonstration;

import java.io.IOException;

class Parent {  
	void msg() throws IOException 
	{
		System.out.println("parent");
	}  
}  

public class TestExceptionChild extends Parent {


	void msg()throws IOException
	{  
		System.out.println("TestExceptionChild");  
		throw new IOException("exception occured");
	}  
	public static void main(String args[]) {  
		Parent p=new TestExceptionChild(); 
		try
		{
			p.msg();  
		}
		catch (IOException e) {
			System.out.println("Exception Handled");
		}

	}  
}

