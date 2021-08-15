package com.string;

import java.text.DecimalFormat;

public class CharCount {

	public static void main(String[] args) {
		
       String str="Hello12 World #$#";
		int upperCase = 0;  
	        int lowerCase = 0;  
	        int digits = 0;  
	        int others = 0;  
	        for (int i = 0; i < str.length(); i++) {  
	            char ch = str.charAt(i);  
	            if (Character.isUpperCase(ch)) {  
	                upperCase++;  
	            }  
	            else if (Character.isLowerCase(ch)) {  
	                lowerCase++;  
	            }  
	            else if (Character.isDigit(ch)) {  
	                digits++;  
	            }  
	            else {  
	                others++;  
	            }  
	        }  
	        double upperCaseLetterPercentage = (upperCase * 100) / str.length();  
	        double lowerCaseLetterPercentage = (lowerCase * 100) / str.length();  
	        double digitsPercentage = (digits * 100) / str.length();  
	        double otherCharPercentage = (others * 100) / str.length();  
	   
		  System.out.println(upperCaseLetterPercentage);
		  System.out.println(lowerCaseLetterPercentage);
		  System.out.println(digitsPercentage);
		  System.out.println(otherCharPercentage);
		
		  DecimalFormat format = new DecimalFormat("##.##");  
	        System.out.println("Uppercase letters are " + format.format(upperCaseLetterPercentage) + "% ");  
	        System.out.println("Lowercase letters are " + format.format(lowerCaseLetterPercentage) + "%");  
	        System.out.println("Digits Are " + format.format(digitsPercentage) + "%");  
	        System.out.println("Other Characters Are " + format.format(otherCharPercentage) + "%");  
	   
		
		
		
		
		
		
	}
}
