package com.Arrays;

public class SparseMatrix {
	
	public static void main(String[] args) {
		
		int a[][]= {
				  {1, 0, 0},    
                  {0, 1, 0},    
                  {0, 0, 1}    
	
		};
		
		
		int count=0;
		int r=a.length;
		int c=a[0].length;
		int size=r*c;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i][j]==0)
				count++;
			}
		}
					
if (count>(size/2))
		{
			System.out.println("sparse matrix");
		}
		
		else
		{
			System.out.println("not a sparse matrix");
		}
	}

}
