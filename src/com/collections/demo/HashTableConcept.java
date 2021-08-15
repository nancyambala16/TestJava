package com.collections.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableConcept {
	
	public static void main(String[] args) {
		
		

		Hashtable<Integer,String> h1=new Hashtable<>();
		h1.put(1, "Hello");
		h1.put(2, "Demo");
		h1.put(1, "Bye");
		
		Hashtable<Integer,String> h2=new Hashtable<>();
        h2=(Hashtable)h1.clone();
        h2.put(3,"Data");
       System.out.println("*******Printing First Hashtable data******");
       for(Entry<Integer,String> entry:h1.entrySet())
       {
    	   System.out.println(entry.getKey()+" : "+entry.getValue());
       }
       System.out.println("*******Printing Second Hashtable data*****");
       for(Entry<Integer,String> entry:h2.entrySet())
       {
    	   System.out.println(entry.getKey()+" : "+entry.getValue());
       }
       
		Map<Integer, String> h3= Collections.singletonMap(10, "nullify");
		System.out.println(h3.get(10));
        h3.put(20, "nul");// if we try add data in immutable map //java.lang.UnsupportedOperationException
        
	}

}
 