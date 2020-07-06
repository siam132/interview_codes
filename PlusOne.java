import java.lang.reflect.Array;

class PlusOne {

    public static void main(String[] args) {
        int[] testArr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        PlusOne plusOne = new PlusOne();

        int[] addedOneArr = plusOne.plusOne(testArr);

        for (int x : addedOneArr) {
            System.out.print(x + " ");
        }
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}