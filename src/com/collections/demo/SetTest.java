package com.collections.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	
	public static void main(String[] args) {
		
		LinkedHashSet hs=new LinkedHashSet<>();
		hs.add("hello");
		hs.add("hello");
		hs.add(10);
		hs.add("bye");
		hs.add("bye");
		hs.add(null);
		System.out.println("Size is: "+hs.size());
		Iterator i1=hs.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());

		}
		
		TreeSet ts=new TreeSet<>();
		ts.add(10);
		ts.add(40);
		ts.add(30);
		//ts.add(null);
		 i1=ts.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());

		}
		
		String s1=new String("Java");
		StringBuilder sbuf=new StringBuilder("Java");
		if(sbuf instanceof Comparable)
		{
			System.out.println("String is of type comparabe");
		}
		else
		{
			System.out.println("String is not of type comparab;e");

		}
		
		
	}
}
