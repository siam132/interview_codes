class TwoSum {

    public static void main(String[] args) {
        int[] testArr = { 2, 7, 11, 15 };

        int[] resArr = twoSum(testArr, 9);

        for (int x : resArr)
            System.out.printf("%d ", x);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] retArr = new int[2];
        int highPtr = 0;
        int lowPtr = numbers.length - 1;

        while (highPtr < lowPtr) {
            if ((numbers[highPtr] + numbers[lowPtr] == target)) {
                retArr[0] = highPtr + 1;
                retArr[1] = lowPtr + 1;
                break; 
            } else if ((numbers[highPtr] + numbers[lowPtr] > target)) {
                lowPtr--;
            } else {
                highPtr++;
            }
        }

        return retArr;

    }

}