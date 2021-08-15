package testingdemonstration;

import java.io.IOException;

class Parent1 {  
	  void msg() throws IndexOutOfBoundsException{System.out.println("parent");}  
	}  

public class TestExceptionChild2 extends Parent1 {

	
	void msg() throws ArrayIndexOutOfBoundsException{  
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]) {  
	   Parent1 p=new TestExceptionChild2();  
	
		  p.msg();  
	  
	
	  
	  }  
}

