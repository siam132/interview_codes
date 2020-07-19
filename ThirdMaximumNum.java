class ThirdMaximumNum {

    public static void main(String[] args) {
        int[] testArr = { 3, 2, 1 };
        System.out.println(thirdMax(testArr));
    }

    public static int thirdMax(int[] nums) {

        if (nums.length == 2)
            return nums[0] > nums[1] ? nums[0] : nums[1];
        if (nums.length == 1)
            return nums[0];

        int[] threeMaxNum = new int[3];

        threeMaxNum[0] = threeMaxNum[1] = threeMaxNum[2] = Integer.MIN_VALUE;

        for (int x : nums) {
            if (x >= threeMaxNum[0])
                threeMaxNum[0] = x;
        }

        for (int x : nums) {
            if (x >= threeMaxNum[1] && x < threeMaxNum[0])
                threeMaxNum[1] = x;
        }

        for (int x : nums) {
            if (x >= threeMaxNum[2] && x < threeMaxNum[0] && x < threeMaxNum[1])
                threeMaxNum[2] = x;
        }

        if (threeMaxNum[2] == Integer.MIN_VALUE)
            return threeMaxNum[2];

        return threeMaxNum[2];
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}