class RunningSum {
    
    public static void main(String[] args) {
        int []arr = {1,1,1,1,1}; 
        runningSum(arr); 

        for(int x: arr)
            System.out.printf("%d ",x);
    }


    public static int[] runningSum(int []nums){
        int SumSoFar = 0; 
        int index = 0; 
        for(int x: nums){
            SumSoFar+=x; 
            nums[index++] = SumSoFar; 
        }
        return nums; 
    }
}