package com.learning.core.day2Session1;

import java.util.Scanner;

public class D02P58 {
	  public static void main(String[] args) 
	  {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the string:");
	        String input = scanner.nextLine();

	        if (input.length() < 4) {
	            System.out.println("The string is too short to be split into four distinct strings.");
	        } else {
	            boolean canBeSplit = checkSplit(input);
	            if (canBeSplit) {
	                System.out.println("The string can be split into four distinct strings.");
	            } else {
	                System.out.println("The string cannot be split into four distinct strings.");
	            }
	        }

	        scanner.close();
	    }

	    public static boolean checkSplit(String input) {
	        int length = input.length();
	        for (int i = 1; i <= length - 3; i++) {
	            for (int j = i + 1; j <= length - 2; j++) {
	                for (int k = j + 1; k <= length - 1; k++) {
	                    String str1 = input.substring(0, i);
	                    String str2 = input.substring(i, j);
	                    String str3 = input.substring(j, k);
	                    String str4 = input.substring(k);
	                    if (!str1.equals(str2) && !str1.equals(str3) && !str1.equals(str4) &&
	                            !str2.equals(str3) && !str2.equals(str4) && !str3.equals(str4)) {
	                        return true;
	                    }
	                }
	            }
	        }
	        return false;
	}
}

