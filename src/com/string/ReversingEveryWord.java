package com.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReversingEveryWord {

	public static void main(String[] args) {
		
		String str="Welcome to Java";
		String[] words=str.split(" ");
		String revStr="";
		for(String word:words)
		{
			StringBuffer sb=new StringBuffer(word);
			sb.reverse();
			revStr=revStr+sb.toString()+" ";
			
		}
		System.out.println(revStr);

	}
}
