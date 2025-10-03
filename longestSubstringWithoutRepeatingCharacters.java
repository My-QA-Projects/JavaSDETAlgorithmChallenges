
// 2. Longest Substring Without Repeating Characters
// Problem Statement: Given a string s, find the length of the longest substring without repeating characters.
// Approach: Sliding window with a set to track characters in the current window; expand right, shrink left on duplicates.
// Example: s = "abcabcbb" → 3 ("abc").
import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String result = longestSubstring(s);
        System.out.println("Longest substring without repeating characters: " + result);
        System.out.println("Length: " + result.length());
    }

    public static String longestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        int startIdx = 0; // will track start of longest substring

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!charSet.contains(currentChar)) {
                charSet.add(currentChar);
                right++;

                if (right - left > maxLength) {
                    maxLength = right - left;
                    startIdx = left; // update start of longest substring
                }

            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        // return the actual substring
        return s.substring(startIdx, startIdx + maxLength);
    }
}