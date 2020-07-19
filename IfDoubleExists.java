import java.util.HashSet;

class IfDoubleExists {

    /*
     * Given an array arr of integers, check if there exists two integers N and M
     * such that N is the double of M ( i.e. N = 2 * M).
     * 
     * More formally check if there exists two indices i and j such that :
     * 
     */
    public static void main(String[] args) {
        int [] arr = {7,1,14,11}; 

        System.out.println(checkIfExists(arr));
    }

    public static boolean checkIfExists(int [] nums){
        HashSet<Double> hs = new HashSet<Double>(); 

        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i]*1.0)){
                return true; 
            }
            hs.add(nums[i]/2.0); 
            hs.add(nums[i]*2.0); 
        }

        return false; 
    }
}