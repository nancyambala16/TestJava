package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionTest {
	
	
	public static void main(String[] args) {
		
		  int[] i= {1,2,3,4};
		  Integer array[]=Arrays.stream( i ).boxed().toArray( Integer[]::new );
		  ArrayList<Integer> list =new ArrayList(Arrays.asList(array));
		  System.out.println(list);
//		 Integer a[]=list.toArray(new Integer[list.size()]);
//		 for(int im:a)
//		 {
//			 System.out.println(im);
//		 }
		  
		  
		
	}
	
	
	

}
