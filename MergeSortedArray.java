class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 3, nums2, 3);

        for (int x : nums1)
            System.out.print(x + " ");
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArr = new int[nums1.length];
        int index = 0;
        int mLen = 0;
        int nLen = 0;
        while (mLen < m && nLen < n) {
            if (nums1[mLen] <= nums2[nLen]) {
                tempArr[index] = nums1[mLen++];
            } else {
                tempArr[index] = nums2[nLen++];
            }
            index++;
        }

        if (mLen < m) {
            while (mLen < m)
                tempArr[index++] = nums1[mLen++];
        }

        if (nLen < n) {
            while (nLen < n)
                tempArr[index++] = nums2[nLen++];
        }
        index = 0;
        for (int x : tempArr) {
            nums1[index++] = x;
        }
    }

}