package com.Arrays;
import java.util.Arrays;
public class MovingZeros
{	
	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 0, 0, 50, 40};
		System.out.println(Arrays.toString(arr));
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0&&arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0)
			{
				j++;
			}
		}	
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
