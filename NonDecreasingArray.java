class NonDecreasingArray {

    public static void main(String[] args) {
        int[] arr = { 3,4,2,3};
        System.out.println(checkPossibility(arr));
    }

    public static boolean checkPossibility(int[] nums) {
        int steps = 0;
        int index = 0;
        while (steps < 2 && index < nums.length - 1) {
            if (nums[index] > nums[index + 1]){
                steps++;
            }

            if (steps > 1)
                return false;

            index++;
        }

        return true;
    }

}