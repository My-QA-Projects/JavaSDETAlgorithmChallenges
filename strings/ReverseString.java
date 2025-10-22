package strings;

import java.util.*;

// =====================================================
// 1. REVERSE STRING
// =====================================================
// Write a function that reverses a string.
// Example: "hello" → "olleh"
// Time: O(n), Space: O(1)

class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Challenge 1: Reverse String ===\n");

        char[] str1 = { 'h', 'e', 'l', 'l', 'o' };
        System.out.print("Input: ");
        System.out.println(str1);
        reverseString(str1);
        System.out.print("Output: ");
        System.out.println(str1);
        System.out.println();

        char[] str2 = { 'H', 'a', 'n', 'n', 'a', 'h' };
        System.out.print("Input: ");
        System.out.println(str2);
        reverseString(str2);
        System.out.print("Output: ");
        System.out.println(str2);
    }
}
