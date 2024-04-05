package com.learning.core.day1session1;

import java.util.HashMap;
import java.util.Map;

public class D01P43 {

	public static int findFirstRepeatingIndex(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return i;
            } else {
                map.put(arr[i], i);
            }
        }
        
        return -1; // If no repeating element found
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 10, 5, 3, 4, 3, 5, 6};
        int index = findFirstRepeatingIndex(arr);
        
        if (index != -1) {
            System.out.println("Index of the first repeating element: " + index);
        } else {
            System.out.println("No repeating element found.");
        }
    }
}
