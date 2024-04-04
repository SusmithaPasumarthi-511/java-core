package com.learning.core.day1session1;

import java.util.Scanner;

public class D02P42 {

	
	public static void main(String[] args) {
       
		//int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
    	int n = 18;
        Scanner sc = new Scanner(System.in);
        int[] A = new int[18];   
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        A[i]=sc.nextInt();  
        }
        // a. Compute the sum of elements from index 0 to 14 and store it at element 15
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        A[15] = sum;
        
        // b. Compute the average of all numbers and store it in element 16
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }
        float average = (float) total /15;
        A[16] = (int) average;
        
        // c. Identify the smallest value from the array and store it at element 17
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        A[17] = min;
        
        // Display the modified array
        System.out.println("Output");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
