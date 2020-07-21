class ReplaceElm {

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        replaceElm(arr);

        for (int x : arr)
            System.out.printf("%d ", x);
    }

    public static int[] replaceElm(int[] arr) {
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = Math.max(arr[i + 1], max);
            max = Math.max(temp, max);

        }
        return arr;
    }

}