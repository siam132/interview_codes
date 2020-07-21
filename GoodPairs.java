class GoodPairs {

    /*
     * Given an array of integers nums.
     * 
     * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
     * 
     * Return the number of good pairs.
     */

    public static void main(String[] args) {
        int []nums = {1,2,3}; 

        System.out.println(numOfIdenticalPairs(nums));
    }

    public static int numOfIdenticalPairs(int[] nums) {
        int pairSoFar = 0;
        if (nums == null || nums.length < 1)
            return pairSoFar;

            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[i] == nums[j])
                        pairSoFar++; 
                }
            }
        return pairSoFar;
    }
}