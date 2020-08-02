class CoinStairCase {

    // You have a total of n coins that you want to form in a staircase shape, where
    // every k-th row must have exactly k coins.

    // Given n, find the total number of full staircase rows that can be formed.

    // n is a non-negative integer and fits within the range of a 32-bit signed
    // integer.
    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        int numOfSteps = 0;
        int currStepCount = 0;

        while (n >= currStepCount) {
            currStepCount++;
            n -= currStepCount;
            if(n>=0){
                numOfSteps++;
            }
        }

        return numOfSteps;
    }
}