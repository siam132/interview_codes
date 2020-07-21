import java.util.Arrays;

class LastStoneWeight {

    public static void main(String[] args) {

        int[] arr = { 3,7,2 };

        System.out.println(lastStone(arr));

    }

    public static int lastStone(int[] stones) {
        for (int i = 0; i < stones.length-1; i++) {
            Arrays.sort(stones);
            int stone1 = stones[stones.length - 1];
            int stone2 = stones[stones.length - 2];
            int smashed = stone1 - stone2;
            stones[stones.length - 1] = smashed;
            stones[stones.length - 2] = 0;
        }

        return stones[stones.length - 1];
    }

}