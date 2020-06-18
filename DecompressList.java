import java.util.ArrayList;
import java.util.List;

class DecompressList {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int[] resultArr = decompressRLElist(arr);
        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }

    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq != 0) {
                list.add(val);
                freq--;
            }
        }

        int[] retArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            retArr[i] = list.get(i);
        }

        return retArr;
    }
}

// for (i 0 to nums.len)
// int freq = nums[i]
// int val = nums[i+1]
// while(freq!=0)
// arr.add(val)
// freq--;