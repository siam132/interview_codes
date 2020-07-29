class RemoveElement {

    public static void main(String[] args) {
        int[] arr = { 1,1,2};
        // int val = 1;
        System.out.println(removeDpl(arr));
        for (int x : arr)
            System.out.printf("%d|", x);
    }

    public static int removeElm(int[] nums, int val) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                len--;
                shiftArr(nums, i);
                i--;
            } else {
                // do nothing
            }
        }
        return len;
    }

    public static int removeDpl(int []nums){
        int len = nums.length;

        for (int i = 0; i < len-1; i++) {
            if (nums[i] == nums[i+1]) {
                len--;
                shiftArr(nums, i);
                i--; 
            } else {
                // do nothing
            }
        }
        return len;
    }

    public static void shiftArr(int[] arr, int index) {
        for (int i = index + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

    }
}