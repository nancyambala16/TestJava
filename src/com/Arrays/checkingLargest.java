package com.Arrays;

import java.util.Arrays;

public class checkingLargest {
	
	
public static void main(String[] args) {
	
int input[]= {1,9,3,5,6};	
		
	int firstLargest, secondLargest;
	  
    //Checking first two elements of input array

    if(input[0] > input[1])
    {   firstLargest = input[0];
        secondLargest = input[1];
    }
    else
    {
        firstLargest = input[1];
        secondLargest = input[0];
    }

    for (int i = 2; i < input.length; i++)
    { 
    	if(input[i] > firstLargest)
        {
            secondLargest = firstLargest;
            firstLargest = input[i];
        }
        else if (input[i] < firstLargest && input[i] > secondLargest)
        {

            secondLargest = input[i];
        }
    }

    System.out.println("Input Array :");
     
    System.out.println(Arrays.toString(input));
     
    System.out.println("Second Largest Element : ");
     
    System.out.println(secondLargest);
}	

}
