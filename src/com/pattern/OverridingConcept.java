package com.pattern;

class DemoTest{
	
	public void demo(int i)
	
	{
		System.out.println("DemoTest Method");
	}
	
}

public class OverridingConcept extends DemoTest {
	
	public void demo(int i)
	
	{
		System.out.println("Overridden Method");
	}
	
	public static void main(String[] args) {
		
		OverridingConcept orc=new OverridingConcept();
		orc.demo(10);
		
	}
	
	

}
