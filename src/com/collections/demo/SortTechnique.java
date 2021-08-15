package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortTechnique {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(302);
		al.add(403);
		al.add(701);
		al.add(204);
		
		Comparator<Integer> com1=(o1,o2)->{
			if(o1<o2)
		    	return 1;
		    else if (o1>o2)
		    return -1;
		    else 
		    	return 0;
		};
		
		Comparator<Integer> com=(o1,o2)->{
			if(o1%10<o2%10)
		    	return 1;
		    else if (o1%10>o2%10)
		    return -1;
		    else 
		    	return 0;
		};
	    Collections.sort(al,com);
		System.out.println("After sorting:" +al);
		
	}
}
