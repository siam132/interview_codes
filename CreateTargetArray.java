import java.util.ArrayList;

class CreateTargetArray {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        int[] newArr = createTargetArray(nums, index);

        for (int x : newArr)
            System.out.printf("%d ", x);
    }

    public static int[] createTargetArray(int nums[], int index[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
        return nums;
    }
}