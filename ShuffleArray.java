import java.util.ArrayList;

class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int[] res = shuffle(arr, 3);

        for (int x : res) {
            System.out.printf("%d ", x);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
       ArrayList<Integer> al = new ArrayList<>();
       int f = 0; 
       int s = n;  

        for (int i = 0; i < nums.length; i += 2) {
           al.add(i, nums[f++]);
           al.add(i+1,nums[s++]); 
        }

        return  al.stream().mapToInt(i -> i).toArray();

    }
}