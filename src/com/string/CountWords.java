package com.string;

import java.util.StringTokenizer;

public class CountWords {

	static int wordCount(String str)
	{  int state =-1;
       int wc = 0;  // word count
        int i = 0;
		  while (i < str.length())
	        {
	            // If next character is a separator, set the
	            // state as OUT
	            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
	                    || str.charAt(i) == '\t')
	                state = -1;
	                 
	      
	            // If next character is not a word separator
	            // and state is OUT, then set the state as IN
	            // and increment word count
	            else if (state == -1)
	            {
	                state = 1;
	                ++wc;
	            }
	      
	            // Move to next character
	            ++i;
	        }
	        return wc;
		}
	
	public static void main(String[] args) {
		
		
		String str="India is    my county\t  count\n Hi";
		String s[]=str.split("\\s+");
		System.out.println(s.length);
		
		System.out.println(str);
		
		StringTokenizer st=new StringTokenizer(str);
		int n=st.countTokens();
		System.out.println(n);
		
		int c=wordCount(str);
		System.out.println(c);
	}
}
