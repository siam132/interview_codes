
class SearchRotatedArray {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 4, 5, 6, 7 };

        System.out.println(Search(arr, 2));

    }

    public static int Search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] >= nums[left]) {
                if (target <= nums[mid] && target >= nums[left])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (target >= nums[mid] && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }
}