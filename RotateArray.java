class RotateArray {
    public static void main(String[] args) {
        int[] testArr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(testArr, 3);

        for (int x : testArr) {
            System.out.printf("%d ", x);
        }
    }

    public static void rotate(int[] nums, int k) {
        if(k == 0) return;
        
        int[] temp = new int[nums.length];
        if (nums.length % 2 != 0) {
            k++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i + k >= nums.length) {
                temp[i] = nums[((i + k) % nums.length)];
            } else {
                temp[i] = nums[(i + k)];
            }
        }
        int index = 0;
        for (int x : temp) {
            nums[index++] = x;
        }
    }
}