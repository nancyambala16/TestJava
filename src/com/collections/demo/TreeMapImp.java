package com.collections.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImp {


	public static void main(String[] args) {

		TreeMap<Integer,String> tmp=new TreeMap();
		tmp.put(10, "A");
		tmp.put(30, "B");
		tmp.put(20, "C");

		Set<Integer> val=tmp.headMap(20).keySet();
		System.out.println(val);

		Set<Integer> val1=tmp.tailMap(20).keySet();
		System.out.println(val1);	
		Collection<String> val3=tmp.headMap(20).values();
		System.out.println(val3);
	}
}
