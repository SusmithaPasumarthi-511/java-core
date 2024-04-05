package com.learning.core.day2Session1;

import java.util.Scanner;

public class D02P54 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        int minDeletions = findMinDeletionsForPalindrome(input);
	        System.out.println("Minimum number of deletions to make the string a palindrome: " + minDeletions);
	        
	        scanner.close();
	    }
	    
	    public static int findMinDeletionsForPalindrome(String str) {
	        // Find the length of the longest palindromic subsequence
	        int longestPalindromicSubsequenceLength = findLongestPalindromicSubsequenceLength(str);
	        
	        // Minimum number of deletions = Length of the string - Length of the longest palindromic subsequence
	        return str.length() - longestPalindromicSubsequenceLength;
	    }
	    
	    public static int findLongestPalindromicSubsequenceLength(String str) {
	        int n = str.length();
	        int[][] dp = new int[n][n];
	        
	        // Initialize the diagonal elements to 1 (single characters are palindrome by default)
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = 1;
	        }
	        
	        // Iterate over the string to fill the dp table
	        for (int len = 2; len <= n; len++) {
	            for (int i = 0; i <= n - len; i++) {
	                int j = i + len - 1;
	                if (str.charAt(i) == str.charAt(j)) {
	                    dp[i][j] = dp[i + 1][j - 1] + 2;
	                } else {
	                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	        
	        return dp[0][n - 1];
	    }

}
