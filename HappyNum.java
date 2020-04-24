
public class HappyNum {
    public static void main(String[] args) {

        System.out.println(Happynum(19));
    }

    public static boolean Happynum(int n) {
        int slow, fast;

        slow = fast = n;
        do {

            slow = numSquareSum(slow);

            fast = numSquareSum(numSquareSum(fast));

        } while (slow != fast);

        return (slow == 1);
    }

    static int numSquareSum(int n) {
        int squareSum = 0;
        while (n != 0) {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

}