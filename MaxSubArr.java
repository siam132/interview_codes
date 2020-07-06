class MaxSubArr {

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        MaxSubArr maxSubArr = new MaxSubArr();

        System.out.println(maxSubArr.maxsubArray(arr));

    }

    public int maxsubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i]; 
            maxSum = Math.max(currSum, maxSum); 
            currSum = Math.max(currSum,0); 
        }

        return maxSum;
    }
}