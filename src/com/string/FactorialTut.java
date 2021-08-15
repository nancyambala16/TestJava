package com.string;

import java.util.Arrays;

public class FactorialTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1=0;
		int t2=1;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(t1);
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}		
		
		int a[]= {440,1,91,17,3};
		Arrays.parallelSort(a,0,3);
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int c[]=Arrays.copyOf(a, a.length);
		System.out.println("Copied element are :"+Arrays.toString(c));
		
		int d[]=Arrays.copyOfRange(a, 0, 2);
		
		System.out.println("Copied element are :"+Arrays.toString(d));
		
		int e[]= a.clone();
		System.out.println("Copied element are :"+Arrays.toString(e));

		
	}
}
