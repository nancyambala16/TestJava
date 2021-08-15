package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumOccuringChar2 {

	
	
   public static void main(String[] args) {
	
	   int arr[]= {1,2,3,3,5,3,5,6,3,5,10,10,10,10};
	   int freq[]=new int[arr.length];
	   for(int i=0;i<arr.length;i++)		   
	   {
			freq[i]=1;
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]==arr[j])
			   {
				   freq[i]++;
				   arr[j]=0;
			   }
		   }
	   }
	   
	   System.out.println(Arrays.toString(arr));
	   int maxcount=0;int res=0;
	   for(int i=0;i<freq.length;i++)
		{
			if(arr[i]!=0&&maxcount<freq[i])
			{
				
                 res=arr[i];
                 maxcount=freq[i];     
			}
		}
System.out.println(res+" ::: "+maxcount);

//for(int i=0;i<freq.length;i++)
//{
//	if(arr[i]!=0&&freq[i]>1)
//	{
//		
//         res=arr[i];
//         maxcount=freq[i];
//         System.out.println(res+" : "+maxcount);
//         break;
//         
//	}
//}





}
}
