import java.util.Arrays;

class TwoCityScheduel {

    public static void main(String[] args) {
        int[][] cost = { { 259, 770 }, { 448, 54 }, { 926, 667 }, { 184, 139 }, { 840, 118 }, { 577, 469 } };

        System.out.println(ScheduleCost(cost));

    }

    public static int ScheduleCost(int[][] cost) {
        int N = cost.length / 2;
        int sum = 0;

        if (cost[0].length < 1)
            return sum;

        for (int i = 0; i < N*2; i++) {
            sum += cost[i][0];
        }

        int[] diff = new int[N * 2];

        for (int i = 0; i < N * 2; i++) {
            diff[i] = cost[i][1] - cost[i][0];
        }
        Arrays.sort(diff);

        for (int i = 0; i < N; i++) {
            sum += diff[i];
        }

        return sum;
    }

}