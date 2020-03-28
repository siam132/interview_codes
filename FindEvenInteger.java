
class FindEvenInteger {

    public static void main(String[] args) {

        int[] arr = { 1, 354, 45, 328, 1446 };

        FindEvenInteger findEvenInteger = new FindEvenInteger();

        System.out.println(findEvenInteger.findNumbers(arr));

    }

    public int findNumbers(int[] nums) {

        int digitCounter = 0, evenCounter = 0, tempDivisor = 0;

        for (int i = 0; i < nums.length; i++) {
            tempDivisor = nums[i];

            while (tempDivisor > 9) {
                tempDivisor = tempDivisor / 10;
                digitCounter++;
            }
            if (++digitCounter % 2 == 0)
                evenCounter++;

            digitCounter = 0;

        }

        return evenCounter;
    }
}

/*
 * 
 * Input: nums = [12,345,2,6,7896] Output: 2 Explanation: 12 contains 2 digits
 * (even number of digits). 345 contains 3 digits (odd number of digits). 2
 * contains 1 digit (odd number of digits). 6 contains 1 digit (odd number of
 * digits). 7896 contains 4 digits (even number of digits). Therefore only 12
 * and 7896 contain an even number of digits.
 * 
 * 
 * 1) int digitCounter, int evenCounter, int tempDivisor 
 * 2) for i 0 to nums.len
 * 3) tempDivisor = nums[i] 
 * 4) while tempDivisor > 9 tempDivisor = tempDivisor/10 digitCounter++; 
 * 5) if ++digitCounter%2 == 0 evenCounter++; 
 * 7) digitCounter = 0;
 * 
 * 8) return evenCounter
 * 
 */
