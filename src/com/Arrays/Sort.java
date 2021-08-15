package com.Arrays;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		
		int arr[]= {9,1,3,11,6,5,2};
		
		for(int i=0;i<arr.length;i++)
		{
			boolean isSwapped=false;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
				    int temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;
				    isSwapped=true;
				}
			}
if(isSwapped==false)
	{
	      break;
	          }
		}
System.out.println(Arrays.toString(arr));

	}

}
