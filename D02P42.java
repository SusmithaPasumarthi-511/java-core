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
          
        A[i]=sc.nextInt();  
        }
     
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        A[15] = sum;
        
        
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }
        float average = (float) total /15;
        A[16] = (int) average;
        
      
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        A[17] = min;
        
        System.out.println("Output");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
