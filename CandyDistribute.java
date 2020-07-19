class CandyDistribute {

    public static void main(String[] args) {
        int[] arr = distributeCandies(10, 3);

        for (int x : arr) {
            System.out.printf("%d ", x);
        }

    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] Retarr = new int[num_people];
        int candyToGive = 1;
        int index = 0;
        while (candies > 0) {
            if (index == Retarr.length)
                index = 0;
            int temp = candies > candyToGive ? candyToGive : candies;
            candies -= candyToGive;
            Retarr[index] = Retarr[index] + temp;
            index++;
            candyToGive++;
            
        }

        return Retarr;
    }

}