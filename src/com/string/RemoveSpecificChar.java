package com.string;

import java.util.Set;

public class RemoveSpecificChar {
	
	public static void main(String[] args) {
		
		String str= "apple is our frUIt";
	    str= str.replaceAll("[ai]", "");
		System.out.println(str);
		
		String newStr="apple,mango,Banana";
		StringBuffer sb=new StringBuffer();

		char ch='a';
		for(int i=0;i<newStr.length();i++)
		{
		    if(newStr.charAt(i)!=ch)
		    {
		    	sb.append(newStr.charAt(i));
		    }
		}
		newStr=sb.toString();
		System.out.println(newStr);
		
		
		
	}

}
