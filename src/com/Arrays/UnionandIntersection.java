package com.Arrays;

import java.util.Arrays;
import java.util.HashSet;
public class UnionandIntersection {

	static void union(Integer[]...args)
	{
		HashSet hs=new HashSet<>();
		for(Integer[] input:args)
		{
			for(int arr:input)
			{
				hs.add(arr);		

			}
		}

		System.out.println(hs);
	}
	
	static void intersection(Integer[]...args)
	{
		HashSet intset=new HashSet<>(Arrays.asList(args[0]));
		
		for(int i=1;i<args.length;i++)
		{
			HashSet<Integer> hst = new HashSet<>(Arrays.asList(args[i]));   
            intset.retainAll(hst);
		}
		System.out.println(intset);
	}
	
	public static void main(String[] args) {

		Integer[] inputArray1 = {2, 3, 4, 7, 1};
		Integer[] inputArray2 = {4, 1, 3, 5};
		Integer[] inputArray3 = {8, 4, 6, 2, 1};
		Integer[] inputArray4 = {7, 9, 4, 1};

		//union(inputArray1, inputArray2, inputArray3, inputArray4);
		intersection(inputArray1, inputArray2, inputArray3, inputArray4);
	}
}
