package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListImplementation {

	public static void main(String[] args) {

		ArrayList<String>list=new ArrayList<>();
		ArrayList list1=new ArrayList();
		list1.add("data1");
		list1.add("demo1");
		list1.add("test1");
	
		list.add("data1");
		list.add("data2");
		list.add("data3");
		list.add("data4");
        
		System.out.println("****Priting via for each loop****");
		for(Object s:list1)
		{
			System.out.println(s);
		}
		
		System.out.println("****exiting for each loop****");
		
		Iterator i1=list.iterator();
		System.out.println("*******Printing through iterator*****");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("****Printing through iterator completed****");

		ArrayList list2=new ArrayList();
		list2.addAll(list);
		list2.add("Hello");
		list2.add("Hi");
		list2.add("Hello");

		System.out.println(list2.size());
		System.out.println("******Printing list data*******");
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}


		System.out.println("******Adding data at index 2******");
		list2.add(2, "Data at index2");
		System.out.println(list2.size());
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}

		System.out.println("******updating data at index 2******");
		list2.set(2, "Data updated at index2");
		System.out.println(list2.size());
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}



		list2.remove(2);
		System.out.println("*****After removing data at index 2******");
		System.out.println(list2.size());
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}

		System.out.println("Printing data at specific index :"+list.get(0));
		System.out.println("Printing  index :"+list.indexOf("Hello"));
		System.out.println("Printing  index in list2 :"+list2.indexOf("Hello"));
		System.out.println("Printing  index in list2 :"+list2.lastIndexOf("Hello"));
		System.out.println("Checking data :"+list2.contains("Hello"));
		System.out.println("Checking data :"+list2.containsAll(list));
		System.out.println("Checking data :"+list2.containsAll(list1));
		System.out.println("Checking data :"+list1.isEmpty());
		
		
		System.out.println("**********Printing list 2*************");
		System.out.println(list2);
		System.out.println(list);
		list2.retainAll(list);
		
		
		System.out.println("After retaining "+list2);
		System.out.println(list1);
		list2.retainAll(list1);
		
		System.out.println("After retaining "+list2);

		System.out.println(list1);
		list1.clear();
		System.out.println(list1);



	}
}
