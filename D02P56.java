package com.learning.core.day2Session1;

import java.util.Scanner;

public class D02P56 {

	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = scanner.nextLine();

	        int prefixSuffixLength = findLongestPrefixSuffix(str);
	        System.out.println("Length of the longest prefix which is also a suffix without overlapping: " + prefixSuffixLength);
	    }

	    private static int findLongestPrefixSuffix(String str) {
	        int n = str.length();
	        int[] lps = computeLPSArray(str);
	        return lps[n - 1];
	    }

	    private static int[] computeLPSArray(String pattern) {
	        int[] lps = new int[pattern.length()];
	        int len = 0;
	        int i = 1;

	        while (i < pattern.length()) {
	            if (pattern.charAt(i) == pattern.charAt(len)) {
	                len++;
	                lps[i] = len;
	                i++;
	            } else {
	                if (len != 0) {
	                    len = lps[len - 1];
	                } else {
	                    lps[i] = 0;
	                    i++;
	                }
	            }
	        }
	        return lps;
	    }
}
