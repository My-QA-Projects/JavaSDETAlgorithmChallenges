package strings;
// =====================================================

// 2. VALID PALINDROME
// =====================================================
// Given a string, determine if it is a palindrome,
// considering only alphanumeric characters and ignoring cases.
// Example: "A man, a plan, a canal: Panama" → true
// Time: O(n), Space: O(1)

class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("=== Challenge 2: Valid Palindrome ===\n");

        String test1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: \"" + test1 + "\"");
        System.out.println("Is Palindrome: " + isPalindrome(test1));
        System.out.println();

        String test2 = "race a car";
        System.out.println("Input: \"" + test2 + "\"");
        System.out.println("Is Palindrome: " + isPalindrome(test2));
        System.out.println();

        String test3 = "racecar";
        System.out.println("Input: \"" + test3 + "\"");
        System.out.println("Is Palindrome: " + isPalindrome(test3));
    }
}
