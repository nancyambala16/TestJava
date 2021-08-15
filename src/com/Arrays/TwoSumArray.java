package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

	static void twosum(int arr[],int target) {		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+ " : "+arr[j]+" = "+target);
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[]= {2,5,-2,9,6,1,0,7,1,3};
		int res[]=new int[2];
		int target=7;
		if(arr.length<2)
		{
			System.out.println("Length is less than 2");

		}
		
		Map<Integer,Integer> map=new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(target-arr[i]))
			{
				map.put(arr[i],i);
			}
			else
			{
				res[1]=arr[i];
				res[0]=arr[map.get(target-arr[i])];
				System.out.println(Arrays.toString(res));
			}
		}	
		twosum(arr, target);
	}	
}
