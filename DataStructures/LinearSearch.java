import java.util.*;
import java.io.*;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 9999;
        int arrSize = 1000000;
        driverFunc(target, arrSize);
      
    }


    public static void driverFunc( int target, int arrSize){
        int[] IntArr = new int[arrSize];
        try {
            File file = new File("output.txt");
            Scanner sc = new Scanner(file);
            for (int i = 0; i < arrSize; i++) {
                IntArr[i] = sc.nextInt();
            }
        } catch (IOException e) {
            System.out.println("there has been an error");
            e.printStackTrace();
        }

        long start = System.currentTimeMillis();
        System.out.printf("Start: %d\n", start);
        System.out.println("Found element " + target + " at : " + searchLin(IntArr, 0,target));
        long end = System.currentTimeMillis();
        System.out.printf("End: %d\n", end);
        System.out.println("Total Time Elapsed: " + ((end - start)));

    }

    public static int searchRec(int[] arr, int currPos, int target) {
        if (currPos == arr.length) {
            return -1;
        } else if (target == arr[currPos])
            return currPos;
            else return searchRec(arr, currPos+1, target);
    }

    public static int searchLin(int [] arr, int currPos,int target){
            for(int i = currPos; i < arr.length; i++){
                if(arr[i]==target)
                    return i; 
            }

            return -1;
    }

}