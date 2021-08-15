package com.string;

public class SwapStrings {
	public static void main(String[] args) {
		String a="Hello";
		String b="World";
	    a=a+b;	    
	    System.out.println(a);
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping a :" +a);
		System.out.println("After swapping b :" +b);
	}
}

