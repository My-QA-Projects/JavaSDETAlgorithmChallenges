package arrays;

// =====================================================
// 3. CONTAINS DUPLICATE
// =====================================================
// Check if array contains any duplicates
// Time: O(n), Space: O(n)
import java.util.*;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int i : nums) {
            if (!seen.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };

        System.out.println("Contains Duplicate Challenge");
        System.out.println("Array 1: [1, 2, 3, 1]");
        System.out.println("Contains duplicate: " + containsDuplicate(nums1));
        System.out.println();
        System.out.println("Array 2: [1, 2, 3, 4]");
        System.out.println("Contains duplicate: " + containsDuplicate(nums2));
    }
}
