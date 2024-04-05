package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P34 {

	
	 public static void main(String[] args)

		{
          int i,j,n;

        System.out.print("Enter number  : ");
     	Scanner in = new Scanner(System.in);
	    n = in.nextInt();

        for(i=1;i<=n;i++)
        {
        for(j=1;j<=i;j++)
         System.out.print(i);
       System.out.println("");
       }
		}
}
