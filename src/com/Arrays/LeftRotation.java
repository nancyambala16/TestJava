package com.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
		
		int n=3;
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<n;i++)
		{
			int j,temp;
			temp=a[0];
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=temp;
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
		
	}
	
	
	
	
	
	
}
