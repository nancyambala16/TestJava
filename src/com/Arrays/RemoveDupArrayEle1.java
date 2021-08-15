package com.Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupArrayEle1 {
	
	public static void main(String[] args) {
		int ia[]= {10,20,30,10,10,50,40};
		
		Set store=new LinkedHashSet<>();
		for(int i=0;i<ia.length;i++)
		{
			store.add(ia[i]);
		}
		System.out.println(store);
	}

}
