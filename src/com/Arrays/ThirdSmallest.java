package com.Arrays;

public class ThirdSmallest {

	public static void main(String[] args) {
		
		int a[]= {1,9,10,4,3,12};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		
		System.out.println(a[a.length-3]);
		//System.out.println(a[2]);

	
	}
	
}
