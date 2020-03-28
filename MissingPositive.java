import java.util.Arrays;

class MissingPositive {

    public static void main(String[] args) {
        MissingPositive missingPositive = new MissingPositive();
        int[] test = { 3, 4, -1, 1 };

        System.out.println(missingPositive.firstMissingPositive(test));

    }

    public int firstMissingPositive(int[] nums) {
        int smallSoFar = 1;

        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                continue;
            if (smallSoFar == nums[i]) {
                smallSoFar++;
            }
        }

        return smallSoFar;

    }
}