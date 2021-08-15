package com.collections.demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Hello");
		System.out.println(list.get(0));

		list.add("Bye");
		
		System.out.println("****Priting via for each loop****");
		for(Object s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("*******Printing using index*****"+list.get(0));
		list.addFirst("demo1");
		list.addLast("demo2");
		list.addFirst("demo3");
		list.addLast("demo4");
		
		list.add(2,"dummy");
		System.out.println("****Priting via for each loop****");
		for(Object s:list)
		{
			System.out.println(s);
		}
		list.removeFirst();
		list.removeLast();
		System.out.println("****Priting via for each loop****");
		for(Object s:list)
		{
			System.out.println(s);
		}
		System.out.println("***********peek concept**********");
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());

	
		System.out.println("***********poll concept**********");
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		
		System.out.println("*********Printing using list Iterator************");
		ListIterator<String> ls=list.listIterator(list.size());
		while(ls.hasPrevious())
		{
			System.out.println(ls.previous());
		}
		
		System.out.println("*********Printing using list Iterator************");
		 ls=list.listIterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		
	Collections.sort(list);	
	System.out.println(list);
	Collections.sort(list,Collections.reverseOrder());		

	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);

		
	}

}
