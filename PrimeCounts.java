class PrimeCounts {

    /*
     * Count the number of prime numbers less than a non-negative number, n.
     * 
     * Example:
     * 
     * Input: 10 Output: 4 Explanation: There are 4 prime numbers less than 10, they
     * are 2, 3, 5, 7.
     */

    public static void main(String[] args) {
        int n = 10;

        System.out.println(primeCount(n));
    }

    public static int primeCount(int n) {
        if (n < 2)
            return 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                count++;
            else {
                // do nothing
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}