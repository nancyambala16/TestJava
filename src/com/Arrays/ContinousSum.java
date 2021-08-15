package com.Arrays;

import java.util.Arrays;

public class ContinousSum {

    static void findSubArray(int[] inputArray, int inputNumber)
    {
    	 for(int i=0; i<inputArray.length; i++){
             int sum = 0;
             for (int j=i; j<inputArray.length; j++){
                sum = sum + inputArray[j];
                if(sum == inputNumber){
                   System.out.println(Arrays.toString(Arrays.copyOfRange(inputArray, i, j+1)));
                }
             }
          }
    }
	
	
	public static void main(String[] args) {
		
		findSubArray(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
		
	}
}
