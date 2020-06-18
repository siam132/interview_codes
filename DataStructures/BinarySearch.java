import java.util.Scanner;
import java.io.*;

public class BinarySearch {

    // Driver function for testing
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
        System.out.println("Found element " + target + " at : " + binary(IntArr, target, 0, arrSize - 1));
        long end = System.currentTimeMillis();
        System.out.printf("End: %d\n", end);
        System.out.println("Total Time Elapsed: " + ((end - start)));

    }

    public static int binary(int[] arr, int target, int start, int end) {
        int mid = -1;
        if (start <= end) {
            mid = (start + end) / 2;
        } else {
            return mid;
        }
        if (target == arr[mid])
            return mid;
        else if (target > arr[mid]) {
            return binary(arr, target, mid + 1, end);
        }

        return binary(arr, target, start, mid - 1);

    }
}