import java.util.Arrays;

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.
*/

public class TrappingRainWater {
 
    public static void main(String[] args) {
        int [] blocks = {0,1,0,2,1,0,1,3,2,1,2,1}; 
       System.out.println(trap(blocks));
    }

    public static int trap(int[] height) {
        
        int [] right_max_arr = new int [height.length]; 
        int [] left_max_arr = new int [height.length];
        int right_max = 0, left_max = 0;
        int total_water = 0; 
        // Pre calculate the max left block and right block in their respective arrays
        for(int i = 1; i < height.length; i++){
            left_max = Math.max(left_max, height[i-1]);
            left_max_arr[i] = left_max; 
            right_max = Math.max(right_max, height[height.length-i]);
            right_max_arr[height.length-i] = right_max;
        }
        // Traverse the heights and take the min of left and right max and get the difference of the current block
        // Only Accept non negative numbers
        for(int i = 1; i < height.length-1; i++){
            int curr_water = (Math.min(left_max_arr[i], right_max_arr[i]) - height[i]); 
            total_water = total_water + (curr_water < 1? 0: curr_water); 
        }
        return total_water;
    }
}
