import java.util.Arrays;

class Candy {

    public static void main(String[] args) {
        int[] ratings = { 1,2,87,87,87,2,1 };

        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int totalCandy = 0;
        int[] forwardCount = new int[ratings.length];
        int[] backwardsCount = new int[ratings.length];
        Arrays.fill(forwardCount, 1);
        Arrays.fill(backwardsCount, 1);
        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i] > ratings[i + 1])
                forwardCount[i]++;
        }

        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i] > ratings[i - 1])
                backwardsCount[i]++;
        }

        for (int i = 0; i < ratings.length; i++) {
            totalCandy += Math.max(forwardCount[i], backwardsCount[i]);
        }

        return totalCandy;

    }
}