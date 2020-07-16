class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));

    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int[] cache = new int[n + 1];
        for (int i = 0; i < cache.length; i++)
            cache[i] = 0;

        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i < cache.length; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n];
    }
}