class SortByParity {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4 };
        int[] res = sortArrayByParity(arr);

        for (int x : res) {
            System.out.printf("%d ", x);
        }
    }

    public static int[] sortArrayByParity(int[] A) {
        int partition = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                partition++;
                int temp = A[partition];
                A[partition] = A[i];
                A[i] = temp;
            }
        }

        return A;
    }
}