package com.learning.core.day2Session1;
import java.util.Scanner;

public class D02P55 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        boolean canFormCircle = canFormCircle(strings);
        if (canFormCircle) {
            System.out.println("yes strings can be arranged in a circular order.");
        } else {
            System.out.println("No strings cannot be arranged in a circular order.");
        }
    }

    private static boolean canFormCircle(String[] strings) {
        int[] inDegree = new int[26];
        int[] outDegree = new int[26];

        // Count in-degree and out-degree for each character
        for (String str : strings) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            inDegree[last - 'a']++;
            outDegree[first - 'a']++;
        }

        // Check if in-degree equals out-degree for each character
        for (int i = 0; i < 26; i++) {
            if (inDegree[i] != outDegree[i]) {
                return false;
            }
        }

        return true;
    }
}
