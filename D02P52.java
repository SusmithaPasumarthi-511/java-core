package com.learning.core.day2Session1;

import java.util.Scanner;

public class D02P52 {

	
	
    public static void main(String[] args) {
    	
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();
        
        countLastNVowels(inputString, n);
    }
    
    public static void countLastNVowels(String str, int n) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        StringBuilder lastNVowels = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                lastNVowels.insert(0, ch);
                count++;
                if (count == n) {
                    break;
                }
            }
        }
        
        if (count < n) {
            System.out.println("Mismatch in Vowel Count");
        } else {
            System.out.println(lastNVowels.toString());
        }
    }

}
