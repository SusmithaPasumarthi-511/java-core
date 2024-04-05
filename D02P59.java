package com.learning.core.day2Session1;

import java.util.Scanner;

public class D02P59 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        String replacedString = replaceSpaces(input);
	        
	        System.out.println("String with spaces replaced: " + replacedString);
	    }
	    
	    public static String replaceSpaces(String input) {
	        StringBuilder stringBuilder = new StringBuilder();
	        
	        for (char c : input.toCharArray()) {
	            if (c == ' ') {
	                stringBuilder.append("%20");
	            } else {
	                stringBuilder.append(c);
	            }
	        }
	        
	        return stringBuilder.toString();
	    }

}
