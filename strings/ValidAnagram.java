package strings;
// =====================================================

// 3. VALID ANAGRAM
// =====================================================
// Given two strings s and t, return true if t is an anagram of s.
// Example: "anagram" and "nagaram" → true
// Time: O(n), Space: O(1) - at most 26 letters

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Count frequency of each character
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("=== Challenge 3: Valid Anagram ===\n");

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("s: \"" + s1 + "\"");
        System.out.println("t: \"" + t1 + "\"");
        System.out.println("Is Anagram: " + isAnagram(s1, t1));
        System.out.println();

        String s2 = "rat";
        String t2 = "car";
        System.out.println("s: \"" + s2 + "\"");
        System.out.println("t: \"" + t2 + "\"");
        System.out.println("Is Anagram: " + isAnagram(s2, t2));
        System.out.println();

        String s3 = "listen";
        String t3 = "silent";
        System.out.println("s: \"" + s3 + "\"");
        System.out.println("t: \"" + t3 + "\"");
        System.out.println("Is Anagram: " + isAnagram(s3, t3));
    }
}