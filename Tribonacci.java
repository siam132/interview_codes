class Tribonacci {
    public static void main(String[] args) {
        Tribonacci t = new Tribonacci();

        System.out.println(t.tribonacci(25));

    }

    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int[] cache = new int[n + 1];
        for (int i = 0; i < cache.length; i++)
            cache[i] = 0;

        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 1;

        for (int i = 3; i < cache.length; i++) {
            cache[i] = cache[i - 1] + cache[i - 2] + cache[i - 3];
        }

        return cache[n];

    }

}