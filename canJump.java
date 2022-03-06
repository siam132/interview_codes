public class canJump {

    public static void main(String[] args) {
        int arr[] = { 3,4,0,0 };
        System.out.println(can_Jump(arr));
    }

    public static boolean can_Jump(int[] nums) {
        if(nums.length <=1) return true;
        for (int i = 0; i < nums.length; i++) {
            int step_can_be_taken = nums[i];
            if (step_can_be_taken == 0 ) return false;
            while (step_can_be_taken > 0) {
                if (i + step_can_be_taken >= nums.length - 1)
                    return true;
                else if (nums[step_can_be_taken] == 0)
                    step_can_be_taken--;
                else
                    break;

            }
        }
        return false;
    }
}
