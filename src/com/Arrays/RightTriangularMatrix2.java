package com.Arrays;

public class RightTriangularMatrix2 {
	
	
	public static void main(String[] args) {
	
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int r=a.length;
		int c=a[0].length;
		
		if(r!=c)
			System.out.println("Matrix should be square matrix");
		else
		{
			  for(int i = 0; i < r; i++){    
                  for(int j = 0; j < c; j++){    
                    if(j < i)    
                      System.out.print("0 ");    
                    else    
                      System.out.print(a[i][j] + " ");    
                }    
                System.out.println();    
			  }
		}
		
		
	}
}
