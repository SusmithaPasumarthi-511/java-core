package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P31
{
	
	   public static void displayMonth(int monthNum)
	   {
	        String[] months = {"January", "February", "March", "April",
	        "May", "June", "July", "August", "September", "October", "November", "December"};
	        if (monthNum >= 1 && monthNum <= 12) {
	            System.out.println("The month is: " + months[monthNum - 1]);
	        } 
	        else
	        {
	            System.out.println("Invalid ");
	        }
	    }

	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	     

	        System.out.print("Enter the month (1-12): ");
	        int month = scanner.nextInt();


	        displayMonth(month);
	    }

}
