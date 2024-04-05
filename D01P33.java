package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P33
{

	
	 public static void main(String[] args)
	 {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter mass obtained by the student: ");
	        double mass = scanner.nextDouble();

	        char grade = calculateGrade(mass);
	        System.out.println("Grade: " + grade);
	    }

	    public static char calculateGrade(double mass) 
	    {
	        if (mass >= 60)
	        {
	            return 'A';
	        } else if (mass >= 45) {
	            return 'B';
	        } else if (mass >= 35) {
	            return 'C';
	        } else if (mass <35) {
	        
	            return 'F';
	        }
			return 0;
	    }
}
