package com.string;


public class reverseTooge {
	public static void main(String[] args) {
		String str="this is javatpoint";
		String words[]=str.split(" ");
		String newString="";
        for(String word:words)
        {
        	String revWord="";
        	StringBuffer sb=new StringBuffer(word);
        	sb.reverse();
        	revWord=revWord+sb.toString();
        	String first=revWord.substring(0,1);
        	String rem=revWord.substring(1).toUpperCase();
        	newString=newString+first+rem+" ";
        }
        System.out.println(newString);
		
	}
}
