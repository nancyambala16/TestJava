package com.Arrays;

public class GCDEx2 {

	public static void main(String[] args) {
		
		int num1=3,num2=8;
		int temp=0,gcd=0;
		while(num2!=0)
		{
			temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		gcd=num1;
		System.out.println(gcd);
	}
}
