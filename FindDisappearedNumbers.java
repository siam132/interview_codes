import java.util.*;

class FindDisappearedNumbers {

    /*
     * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
     * elements appear twice and others appear once.
     * 
     * Find all the elements of [1, n] inclusive that do not appear in this array.
     * 
     * Could you do it without extra space and in O(n) runtime? You may assume the
     * returned list does not count as extra space.
     * 
     * Example:
     * 
     * Input: [4,3,2,7,8,2,3,1]
     * 
     * Output: [5,6]
     */
    public static void main(String[] args) {

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(findDisappearedNumbers(nums).toString());

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] - 1]++;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0)
                ls.add(i + 1);
        }
        return ls;
    }

}