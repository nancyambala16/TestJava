package com.Arrays;

import java.util.Arrays;

public class Leaderclass {

	static void findTheLeaders(int inputArray[])
    {
       
        int len=inputArray.length;
        int max=inputArray[len-1];
        System.out.println("Printing leader elements for : "+Arrays.toString(inputArray));
        System.out.println(max);
        for(int i=len-2;i>=0;i-- )
        {
        	if(inputArray[i]>max)
        	{
        		System.out.println(inputArray[i]);
        		max=inputArray[i];
        	}
        }
    }
  
    public static void main(String[] args)
    {
        findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
  
        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
  
        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
  
        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
