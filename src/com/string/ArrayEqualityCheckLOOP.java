package com.string;

import java.util.Arrays;

public class ArrayEqualityCheckLOOP {
	
	public static void main(String[] args) {
		
	int a[]= {1,2,6,7};
	int b[]= {1,2,9,6,7};
    //boolean status=Arrays.equals(a, b);
//    if(status==false)
//    {
//    	System.out.println("Arrays are not Equal");
//    }
//    else {
//    	System.out.println("Arrays are equal");
//    }
//    
	boolean flag=true;
	if(a.length==b.length)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				flag=false;
				break;
			}
		}
	}
    
	else {
		flag=false;
	}
    
	  if(flag==false)
	    {
	    	System.out.println("Arrays are not Equal");
	    }
	    else {
	    	System.out.println("Arrays are equal");
	    }
    		
	}
}
