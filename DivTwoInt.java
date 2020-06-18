public class DivTwoInt {

    public static void main(String[] args) {

        int dividend = -16;
        int divisor = 5;
        int sign = 1;

        if(dividend < 0 && divisor < 0){
            sign*=1; 
        }else if(dividend < 0 && divisor >= 0){
            sign*=-1;
        }else if(dividend >= 0 && divisor < 0){
            sign*=-1;
        }else{
            sign*=1;
        }

        int result = div(Math.abs(dividend), Math.abs(divisor));

        System.out.println(result * sign);

    }

    public static int div(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
         else   if (dividend == Integer.MIN_VALUE && divisor == 1)
            return Integer.MIN_VALUE;

        int result = 0;

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            result++;
        }

        return result;
    }

}