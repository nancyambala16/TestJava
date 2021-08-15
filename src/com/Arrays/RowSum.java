package com.Arrays;
public class RowSum {	
	public static void main(String[] args) {


		int rowsum=0;
		int colsum=0;
		int arr[][]= {{1,2,3},{4,5,6}};
		int r=arr.length;
		int c=arr[0].length;
		System.out.println("Row count is : "+r);
		System.out.println("Column count is : "+c);

		for(int i=0;i<r;i++)
		{
			rowsum=0;
			for(int j=0;j<c;j++)
			{
                 rowsum=rowsum+arr[i][j];
			}
			
			System.out.println("Sum of Row "+i+" is : "+rowsum);
			
		}
		
		for(int i=0;i<c;i++)
		{
			colsum=0;
			for(int j=0;j<r;j++)
			{
				colsum=colsum+arr[j][i];
			}
			
			System.out.println("Sum of column "+i+" is : "+colsum);
			
		}
		

	}
}
