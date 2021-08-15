package com.string;

public class InitialCapital {
	public static void main(String[] args) {
		String str="this is javatpoint";
		String words[]=str.split(" ");
		String newString="";
        for(String word:words)
        {
        	String first=word.substring(0,1);
        	String rem=word.substring(1);
        	newString=newString+first+rem.toUpperCase()+" ";
        }
	
		System.out.println(newString);
	}
	
}
