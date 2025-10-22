package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Remove the duplicates from the array
public class RemovingDuplicates {

    public static int[] noDuplicates(int[] nums) {
        Set<Integer> single = new HashSet<>();

        for (int i : nums) {
            single.add(i);
        }
        return single.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 3, 4, 4, 5, 8, 9 };
        System.out.println(Arrays.toString(noDuplicates(nums)));
    }
}
