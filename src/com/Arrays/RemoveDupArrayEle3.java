package com.Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupArrayEle3 {

	static void removeDuplicates(int[] arrayWithDuplicates)
	{
		System.out.println("Array With Duplicates : "+Arrays.toString(arrayWithDuplicates));

		int noOfUniqueElements = arrayWithDuplicates.length;

		for (int i = 0; i < noOfUniqueElements; i++) 
		{
			for (int j = i+1; j < noOfUniqueElements; j++)
			{

				if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
				{
					//arrayWithDuplicates[j] = 0;                    
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];                    
					noOfUniqueElements--;
				//	 j--;
				}
			}
		}

		System.out.println(Arrays.toString(arrayWithDuplicates));
		//System.out.println(noOfUniqueElements);
			
		//int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);   
		 arrayWithDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);   

		System.out.println("Array Without Duplicates : "+Arrays.toString(arrayWithDuplicates));

		System.out.println("==============================");
	}

	public static void main(String[] args) {
		int a[]= {10,20,30,10,30,50,40};
		System.out.println(a.length);
		removeDuplicates(a);
		int b[][]= {{10,20,20,30},{10,30,30}};
		for(int c[]:b)
		{
			removeDuplicates(c);

		}

	}
}