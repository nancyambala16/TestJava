package com.Arrays;

import java.util.Arrays;

public class LargestSmallest {
	
	public static void main(String[] args) {
		int a[]= {4,9,3,1};
		int largest=a[0];
		int smallest =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
				
		}
		System.out.println("Largest no is : "+largest);
		System.out.println("Smallest no is : "+smallest);
}
}
