package com.Arrays;

import java.util.Arrays;

public class ReverseArray {

	static void arrayRev(int a[])
	{
		System.out.println("Array before revere: "+Arrays.toString(a));

		int start=0;
		int end=a.length-1;
		int temp;
		while(start<end)
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	System.out.println("Array after revere: "+Arrays.toString(a));
	}  
	public static void main(String[] args)
	{
		int a[]={42, 15, 12, 8, 6, 32};

		arrayRev(a);
		
	}
}