class MountainArray {

    /*
     * Given an array A of integers, return true if and only if it is a valid
     * mountain array.
     * 
     * Recall that A is a mountain array if and only if:
     * 
     * A.length >= 3 There exists some i with 0 < i < A.length - 1 such that: A[0] <
     * A[1] < ... A[i-1] < A[i] A[i] > A[i+1] > ... > A[A.length - 1]
     */
    public static void main(String[] args) {

        int[] arr = { 0,1,2,3,4,5,6,7,8,9};

        System.out.println(checkIfValid(arr));
    }

    public static boolean checkIfValid(int[] height) {

        if (height.length < 3)
            return false;

        int index = 0;
        boolean flag = true;
        while (index < height.length - 1) {
            if (height[index] < height[index + 1]) {
                index++;
            } else {
                break;
            }
        }

        if(index == height.length-1 || index == 0) return false;

        while (index < height.length - 1) {
            if (height[index] > height[index + 1]) {
                index++;
            } else {
                flag = false;
                break;
            }
        }

        return flag;
    }

}