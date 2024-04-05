package com.learning.core.day2Session1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D02P53 {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	     //   System.out.println("Enter 'exit' to stop.");
	        
	        while (true) {
	            System.out.print("Enter a string: ");
	            String input = scanner.nextLine();
	            
	            if (input.equals("exit")) {
	                break;
	            }
	            
	            List<String> subsequences = generateSubsequences(input);
	            System.out.println("Subsequences of " + input + ":");
	            for (String subsequence : subsequences) {
	                System.out.println(subsequence);
	            }
	        }
	        
	        scanner.close();
	    }
	    
	    public static List<String> generateSubsequences(String str) {
	        List<String> subsequences = new ArrayList<>();
	        generateSubsequencesHelper(str, 0, "", subsequences);
	        return subsequences;
	    }
	    
	    private static void generateSubsequencesHelper(String str, int index, String current, List<String> subsequences) {
	        if (index == str.length()) {
	            subsequences.add(current);
	            return;
	        }
	        
	        // Include current character
	        generateSubsequencesHelper(str, index + 1, current + str.charAt(index), subsequences);
	        
	        // Exclude current character
	        generateSubsequencesHelper(str, index + 1, current, subsequences);
	    }
}
