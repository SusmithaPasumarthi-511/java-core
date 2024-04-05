package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P32 {

	public static void main (String[] args)
	{
		int i;
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Week Number :");
	int num = input.nextInt();			
	
	
      
	
	if(num==1)
		System.out.println("This is a Sunday");
	else if(num==2)
		System.out.println("This is a Monday");
	else if(num==3)
		System.out.println("This is a Tuesday");
	else if(num==4)
		System.out.println("This is a Wednesday");
	else if(num==5)
		System.out.println("This is a Thursday");
	else if(num==6)
		System.out.println("This is a Friday");
	else if(num==7)
		System.out.println("This is a Saturday");
	else if(num>7)
		System.out.println("Invalid");
	else if(num<=0)
		System.out.println("Invalid ");
	else
		System.out.println("Enter 1 to 7...");

	}
	}
