package com.string;
public class Toogle {
	public static void main(String[] args) {
		String str="this is javatpoint";
		String words[]=str.split(" ");
		String newString="";
        for(String word:words)
        {
        	String first=word.substring(0,1);
        	String rem=word.substring(1);
        	newString=newString+first.toUpperCase()+rem+" ";
        }
	
		System.out.println(newString);
		
		int ch[]=new int[4];
		ch[0]=11;
		ch[1]=2;
		System.out.println(ch.length);
	}
	
}
