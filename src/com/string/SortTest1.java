package com.string;

import java.util.Arrays;

public class SortTest1 {
	
	public static void main(String[] args) {
		
		int a[]= {1,9,6,3};
		
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j=0;j<a.length-1;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						
					}
				}
			
		}
		
	
	System.out.println(Arrays.toString(a));
	
	System.out.println("Printing Arrays in reverse Order");
	for(int i=0;i<a.length-1;i++)
	{
		
		for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		
	}
	System.out.println(Arrays.toString(a));
	
}
}
