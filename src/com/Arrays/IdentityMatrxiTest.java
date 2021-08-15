package com.Arrays;

public class IdentityMatrxiTest {
	
	public static void main(String[] args) {
		
		int a[][]= {
				  {1, 0, 0},    
                  {0, 1, 0},    
                  {0, 0, 1}    
	
		};
		
	
		boolean status=true;
		if(a.length!=a[0].length)
		{
			status=false;
		}
		
		else {
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(i==j&&a[i][j]!=1)
					{
						status=false;
						break;
					}
					else if(i!=j&&a[i][j]!=0)
					{
						status=false;
						break;
					}
				}
			}
		}
		
		if(status)
		{
			System.out.println("identity matrix");
		}
		
		else
		{
			System.out.println("not an identity matrix");
		}
	}

}
