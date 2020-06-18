class Fib {

    public static void main(String[] args) {

        long [] memo = new long[50]; 

        for(int i = 0; i<memo.length; i++)
            memo[i] = -1; 

        long start = System.nanoTime(); 
        System.out.println("Recursive Fib: "+RecFib(49));
        long end = System.nanoTime(); 
        System.out.println("Time elapsed Recursive Fib(): "+ ((end - start)/1000000)+" milliseconds");

        start = System.nanoTime(); 
        System.out.println("Dynamic Fib: "+DynFib(49, memo));
        end = System.nanoTime(); 
        System.out.println("Time elapsed Dynamic Fib(): "+ ((end - start)/1000000)+" milliseconds");

    }

    public static long RecFib(int n) {
        long result;
        if (n == 1 || n == 2)
            result = 1;
        else {
            result = RecFib(n - 1) + RecFib(n - 2);
        }

        return result;
    }

    public static long DynFib(int n, long[] memo) {
        long result;
        if (memo[n] != -1) {
            return memo[n];
        }
        if (n == 1 || n == 2) {
            result = 1;
        }
        else{
        result = DynFib(n - 1, memo) + DynFib(n - 2, memo);
        }
        memo[n] = result;

        return result;
    }
}