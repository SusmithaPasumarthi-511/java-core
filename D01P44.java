package com.learning.core.day1session1;

import java.util.ArrayList;
import java.util.List;

public class D01P44 {
	

    public static List<List<Integer>> findCombinations(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, k, 0);
        return result;
    }
    
    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int k, int start) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, k, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 2;
        List<List<Integer>> combinations = findCombinations(nums, k);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

}
