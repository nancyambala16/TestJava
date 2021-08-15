package com.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		char c=65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(c+i)+" ");
			}
			System.out.println();
		}
		
	}
}
