// public Problem Statement: Given an array of integers nums and an integer target, return indices of two numbers that add up to target. Assume exactly one solution exists.
// Approach: Use a hash map to store seen numbers and their indices. For each num, check if (target - num) exists in the map.
// Example: nums = [2,7,11,15], target = 9 → [0,1] (2+7=9). 

import java.util.Arrays;

public class twoSum {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 7, 11, 15 };
        int target = 9;

        int[] result = twoSums(nums, target);

        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No solution found");
        }
    }

    public static int[] twoSums(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null; // no solution
    }
}
