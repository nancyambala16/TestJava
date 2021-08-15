package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListImplementationusingListIterator {

	public static void main(String[] args) {

		ArrayList<String>list=new ArrayList<>();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.add("data4");
        
        ListIterator li=list.listIterator();
        while(li.hasNext())
        {
        	System.out.println(li.next());
        }
        
        System.out.println("*****printing using lamba expression*********");
      list.forEach(show->{
    	  System.out.println(show);
      });
      
      Iterator i1=list.iterator();
      System.out.println("printing using lamba expression and foreach remaing");
      i1.forEachRemaining(show->{
    	  System.out.println(show);
      });
      
      
        
        System.out.println("Printing using list Iterator has previous method");
        li=list.listIterator(list.size());
        while(li.hasPrevious())
        {
        	System.out.println(li.previous());
        }

        System.out.println("printing using lamba expression and foreach remaing");
        li.forEachRemaining(show->{
      	  System.out.println(show);
        });
          
        
//		ArrayList<String>list1=new ArrayList<>();
//	    list1.add("data7");
//        list1.add("data3");
//        list1.add("data4");
//        list1.add("data8");
//        list1.retainAll(list);
//        System.out.println(list1);   
        
        /*
         * 
         * 
         * 
         * */

	}
}
