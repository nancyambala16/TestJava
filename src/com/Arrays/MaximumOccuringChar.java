package com.Arrays;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumOccuringChar {

   public static void main(String[] args) {
	
	   Integer arr[]= {1,2,3,2,5,5,6,5,10,10,10,10};
	   
	   HashMap<Integer,Integer> hm=new HashMap();
	  for(int i=0;i<arr.length;i++)
	  {
		  Integer count=hm.get(arr[i]);
		  if(count ==null)
		  {
			  hm.put(arr[i], 1);
		  }
		  else
		  {
			  hm.put(arr[i], ++count);
		  }
	  }
	   
	  int maxCount=0;int key=0;
	  for(Entry<Integer,Integer> m:hm.entrySet())
		{
		  if(maxCount<m.getValue())	  
		  {
			  key=m.getKey();
			  maxCount=m.getValue();
		  }
		}
	  System.out.println("Maximum occurring ele is: "+key +"  "+"and freq is :::"+maxCount);
}
}
