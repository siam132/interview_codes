class UglyNumber {

    /*
     * Write a program to check whether a given number is an ugly number.
     * 
     * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
     */

    public static void main(String[] args) {
        // System.out.println(isUgly(6));
        System.out.println(nthUglyNum(15));
        System.out.println(nthUglyNumSlow(15));

    }

    public static int nthUglyNum(int k) {
        int[] res = new int[k + 1];
        res[0] = 1;
        int p = 0, q = 0, r = 0, i = 1;

        while (i < res.length) {
            int min = Math.min(res[p] * 2, Math.min(res[q] * 3, res[r] * 5));

            p += min % 2 == 0 ? 1 : 0;
            q += min % 3 == 0 ? 1 : 0;
            r += min % 5 == 0 ? 1 : 0;
            res[i] = min;
            i++;
        }
        return res[k - 1];
    }


    public static int nthUglyNumSlow(int k){
        int result = 1; 
        int counter = 1; 
        while( k > 0){
            if(isUgly(counter)){
                result = counter; 
                counter++; 
                k--; 
            }else{
                counter++; 
            }
        }

        return result; 
    }

    public static boolean isUgly(int num) {
        if (num <= 0)
            return false;
        if (num == 1)
            return true;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else
                return false;
        }

        return true;
    }

}