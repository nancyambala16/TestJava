package com.Arrays;

public class GCDEx1 {

	public static void main(String[] args) {
		
		
		int x = 12, y = 24,z=36, gcd = 1;  
		//running loop form 1 to the smallest of both numbers  
		for(int i = 1; i <= x && i <= y &&i<=z; i++)  
		{  
		//returns true if both conditions are satisfied   
		if(x%i==0 && y%i==0 &&z%i==0 )  
		//storing the variable i in the variable gcd  
		gcd = i;  
		}  
		
		System.out.println(gcd);
		int lcd=(x*y*z)/gcd;
		System.out.println(lcd);
		
		System.out.println(Math.sqrt(25));
		
		
		
		
		
		String str="DelhiHi";
		for(int i=0;i<str.length();i++)
		{
			if(str.length()!=10)
			{
				str=str+str.charAt(i);
			}
		}
		
		
		System.out.println(str);
		
		
			}
}



