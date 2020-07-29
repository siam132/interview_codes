class StepByStepSum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, -3 };

        System.out.println(minStartValue(arr));
    }

    public static int minStartValue(int[] nums) {
        int startValue = 1; // startValue needs to be at least 1
        int runningSum = 1; // runningSum just starts with startValue
        for (int i = 0; i < nums.length; i++) {
            if (runningSum + nums[i] < 1) {
                int extraNeeded = 1 - (runningSum + nums[i]);
                startValue += extraNeeded;
                runningSum += extraNeeded;
            }
            runningSum += nums[i]; // update runningSum
        }
        return startValue;
    }
}