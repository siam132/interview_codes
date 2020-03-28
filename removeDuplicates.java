
class removeDuplicates {
    public static void main(String[] args) {
        int[] test = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(RemoveDuple(test));

    }

    public static int RemoveDuple(int[] arr) {
        int current = 0;
       

        for (int i = 0; i < arr.length; i++) {
            if (arr[current] != arr[i]){
                arr[++current] = arr[i];

            }
        }
        return current + 1;

    }
}