package arrays;

import java.util.*;

// =====================================================
// MAXIMUM SUM SUBARRAY OF SIZE K
// =====================================================
// Given an array of integers and an integer k, find the 
// maximum sum of any contiguous subarray of size k.
//
// Example 1:
// Input: nums = [2, 1, 5, 1, 3, 2], k = 3
// Output: 9
// Explanation: Subarray [5, 1, 3] has sum = 9
//
// Example 2:
// Input: nums = [2, 3, 4, 1, 5], k = 2
// Output: 7
// Explanation: Subarray [3, 4] has sum = 7
//
// Time Complexity: O(n)
// Space Complexity: O(1)
public class SlidingWindowsArrays {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 1, 2, 2, 3 };
        int k = 3;
        maxSumSubarray(nums, k);
    }

    public static int maxSumSubarray(int[] nums, int k) {
        // Calculate sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            System.out.println("Adding iteration[" + i + "] = " + nums[i] + ", windowSum = " + windowSum);
        }

        int maxSum = windowSum;
        System.out.println("Initial maxSum = " + maxSum);

        // Slide the window: add next element, remove first element
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum + nums[i] - nums[i - k];
            System.out.println("iteration: " + nums[i - k] + ", i:" + i + ", nums[i]:" + nums[i] + ", windowSum: "
                    + windowSum + " ");
            maxSum = Math.max(maxSum, windowSum);
            System.out.println("maxSum updated to = " + maxSum);
        }

        System.out.println("Final maxSum = " + maxSum);
        return maxSum;

    }
}