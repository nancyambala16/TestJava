package com.string;

public class RotationString {
	
	public static void main(String[] args) {
		
		String s1="aacd";
		String s2="acda";
		
       if(s1.length()!=s2.length())
       {
    	   System.out.println("Non Rotation string");
       }
       else
       {
    	   String s3=s1+s1;
    	   if(s3.contains(s2))
    	   {
    		   System.out.println("Rotational string ");
    	   }
    	   else
    		   System.out.println("Non Rotation String");
       }
		
		
      	
		
		
		
		
		
		
		
		
		
		
		
	}

}
