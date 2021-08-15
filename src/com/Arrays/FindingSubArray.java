package com.Arrays;

public class FindingSubArray {

	static int subarray(int arr[])
	{
         int maxsoFar=arr[0];
         int currentMax=arr[0];
         for(int i=1;i<arr.length;i++)
         {
        	 currentMax=currentMax*arr[i];
        	 if(currentMax<arr[i])
        	 {
        		 currentMax=arr[i];
        	 }
        	 if(maxsoFar<currentMax)
        	 {
        		 maxsoFar=currentMax;
        	 }
       
         }
		
		return maxsoFar;
		
	}
	public static void main(String[] args) {
		
	int[] arr= {4,3,-2,6,-12,7,-1,6};
	int a=subarray(arr);
		System.out.println(a);
		System.out.println(subarray(new int[] {2,3,-2,4}));
	}
	
	
}
