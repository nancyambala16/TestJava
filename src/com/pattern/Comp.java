package com.pattern;

public class Comp {
	
	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s.toCharArray().length);
		System.out.println(s.lastIndexOf(""));

		Integer i=129;
		Integer j=129;
		if(i==j)
			System.out.println("Both equal");
		
		else
			System.out.println("Not equal");
	}

}
