package com.collections.demo;

import java.util.PriorityQueue;

public class PriorityQueueImp {

	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue<>();
		queue.add("10");
		queue.add("100");
		queue.add("nancy");
		queue.add("10");
		queue.add("Helll");
		//queue.add(null); NP Exception 
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println("*****print****");
		for(Object obj:queue)
		{
			System.out.println(obj);
		}


		System.out.println("Polled Element is : "+queue.poll());
		System.out.println("*****print****");

		for(Object obj:queue)
		{
			System.out.println(obj);
		}
	}
}
