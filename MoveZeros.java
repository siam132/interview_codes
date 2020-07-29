class MoveZeros {

    public static void main(String[] args) {
        int []arr = {0,1,3,0,12}; 
        moveZeros(arr);
        for(int x: arr)
            System.out.println(x);
    }

    public static void moveZeros(int nums[]){
        int len = nums.length; 
        int writePtr = 0; 
        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                nums[writePtr] = nums[i]; 
                writePtr++; 
            }
        }
        
        for(int i = writePtr; i < len; i++){
            nums[i] = 0; 
        }
    }
    
}