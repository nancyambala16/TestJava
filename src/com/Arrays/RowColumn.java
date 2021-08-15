package com.Arrays;
public class RowColumn {	
	public static void main(String[] args) {
		int sum =0;
		int colsum=0;
		int arr[][]= {{1,2,3},{4,5,6}};
		int r=arr.length;
		int c=arr[0].length;
		
		for(int i=0;i<r;i++)
		{sum=0;
			for(int j=0;j<c;j++)
			{
				sum =sum+arr[i][j];
			}
			System.out.println("Sum of Row : "+i+" is "+sum);
		}
		
		for(int i=0;i<c;i++)
		{colsum=0;
			for(int j=0;j<r;j++)
			{
				colsum =colsum+arr[j][i];
			}
			System.out.println("Sum of Column : "+i+" is "+colsum);
		}	
		
		
	}
}
