package com.Arrays;

public class SquareRootTest {

	public static void main(String[] args) {
				
		double num=25;
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		
		System.out.println(sqrtroot);	
	}
}