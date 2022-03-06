import java.util.HashSet;

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Input: nums = [1,2,3,1]
// Output: true

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        boolean has_duplicate = false;
        int index = 0;
        while (!has_duplicate && index < nums.length) {
            has_duplicate = !hs.add(nums[index++]);
            if (has_duplicate) {
                return has_duplicate;
            }
        }

        return has_duplicate;
    }
}
