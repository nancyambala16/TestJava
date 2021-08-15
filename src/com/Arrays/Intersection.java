package com.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
	
	public static void main(String[] args) {
		
        String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};  
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR","ONE"};  
        
        HashSet<String> set = new HashSet<String>();
        
        for (int i = 0; i < inputArray1.length; i++)
        {
            for (int j = 0; j < inputArray2.length; j++)
            {
                if(inputArray1[i].equals(inputArray2[j]))
                {
                    set.add(inputArray1[i]);
                }
            }
        }
        System.out.println("Using Loop: "+set);
        
        
        
        
  
        HashSet<String> set1 = new HashSet<String>(Arrays.asList(inputArray1));
         
        HashSet<String> set2 = new HashSet<String>(Arrays.asList(inputArray2));
        HashSet<String> union = new HashSet<String>(set1);
        union.addAll(set2);
        System.out.println(union);
        HashSet<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
        HashSet<String> diff = new HashSet<String>(set1);
        diff.removeAll(set2);
        System.out.println(diff);
        
       
    }

}
