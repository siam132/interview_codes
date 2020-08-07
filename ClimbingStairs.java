import java.util.Arrays;

class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int[] cache = new int[n + 1];
        Arrays.fill(cache,0); 
        cache[1] = 1;
        cache[2] = 2;

        for (int i = 3; i < cache.length; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n];
    }

}