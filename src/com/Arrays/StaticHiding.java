package com.Arrays;

class staticHiding1
{
	static void view()
	{
		System.out.println("Parent class method");
			}
	
	static void view(int args)
	{
		System.out.println("Parent class argumented method:::"+ args);
	}
}

class staticHiding2 extends staticHiding1
{
	static void view()
	{
		System.out.println("child class method");
	}
}

public class StaticHiding {
	public static void main(String[] args) {
		staticHiding2 s2= new staticHiding2();
		s2.view();
		s2.view(10);
		
		staticHiding1 s1= new staticHiding1();
        s1.view();
        s1.view(20);
        
		staticHiding1 s3= new staticHiding2();
		s3.view();
		s3.view(30);
	
	}
}
