package com.learning.core.day2Session1;

import java.util.Scanner;

public class D02P51 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        
     
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
        
       
        String upperCaseString = inputString.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseString);
        
     
        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
    public static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
