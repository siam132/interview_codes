import java.util.Arrays;

class HeightChecker {
    public static void main(String[] args) {
        int[] heights = { 5, 1, 2, 3, 4 };

        System.out.println(heighChecker(heights));
    }

    public static int heighChecker(int[] heights) {
        int numOfSteps = 0;
        int[] sortedArr = new int[heights.length];
        int index = 0;
        for (int x : heights) {
            sortedArr[index++] = x;
        }
        Arrays.sort(sortedArr);
        index = 0;
        while (index < heights.length) {
            if (sortedArr[index] != heights[index])
                numOfSteps++;
            index++;
        }
        return numOfSteps;
    }
}