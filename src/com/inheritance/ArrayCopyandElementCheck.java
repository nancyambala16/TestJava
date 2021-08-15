package com.inheritance;

import java.util.Arrays;

public class ArrayCopyandElementCheck {


	public static void main(String[] args) {

		int arr1[]= {2,3,4,9};
		int arr2[]=Arrays.copyOf(arr1, arr1.length);
		int[] arr4=Arrays.copyOfRange(arr1, 1,7);
		System.out.println(Arrays.toString(arr4));
		int arr3[]=arr1.clone();
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr2));
  
		

	}








}
