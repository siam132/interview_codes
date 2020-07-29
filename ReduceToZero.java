class ReduceToZero {

    public static void main(String[] args) {

        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int nums) {
        int steps = 0;
        while (nums > 0) {

            if (nums % 2 == 0) {
                nums /= 2;
            } else {
                nums -= 1;

            }
            steps++;
        }

        return steps;
    }

}