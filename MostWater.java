

class MostWater {

    public static void main(String[] args) {

        int[] test = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(MaxArea(test));

    }

    public static int MaxArea(int[] height) {
        int largestSoFar = -1;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int smallerBar = -1;
        int x = -1;
        for (int i = 0; i < height.length; i++) {
            smallerBar = height[leftPointer] < height[rightPointer] ? height[leftPointer] : height[rightPointer];
            x = (height.length - 1) - i;
            largestSoFar = x * smallerBar > largestSoFar ? (x * smallerBar) : largestSoFar;

            if (height[rightPointer] <= height[leftPointer]) {
                rightPointer--;
            } else if (height[leftPointer] <= height[rightPointer]) {
                leftPointer++;
            }
        }

        return largestSoFar;
    }
}

/*
 * 
 * new arr = int [height.len];
 * 
 * for i 0 to height.len int x = height.len-(i*2) int y =
 * min(height[i],height[height.len-i]) arr[i] = x*y;
 * 
 * 
 * return arr[largest];
 * 
 */