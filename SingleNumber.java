import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1 };

        System.out.println(SingleNum(arr));
    }

    public static int SingleNum(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int temp = hm.get(nums[i]).intValue();
                hm.put(nums[i], ++temp);
            } else if (!hm.containsKey(nums[i]))
                hm.put(nums[i], 0);
        }

        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) == 0)
                return nums[i];
        }
        return Integer.MAX_VALUE;
    }

}