package com.Arrays;

public class FirstRepeating {

	public static void main(String[] args) {
		
		int arr[]= {8,3,3,1,4,8,4,5};
		
		
	//	for( int i=0;i<arr.length-1;i++)
//		{
//			for(int j=i+1;j<arr.length-1;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println(arr[i]);
//					status=true;
//					break;
//				}
//				
//			if(status)
//				break;
//			}
//		}
		
		
		
		for( int i=0;i<arr.length-1;i++)
		{
			boolean status=false;

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					status=true;
					System.out.println("Duplicate is :"+arr[i]);
					break;
				}	
				
			}
			if(status==false)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		
		
		
		
		
	}
	
	
	
}
