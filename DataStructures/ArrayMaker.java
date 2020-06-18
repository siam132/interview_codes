import java.io.*;
import java.util.*;

public class ArrayMaker {
    public static void main(String[] args) {

        MakeArray(1000000,10000);

    }

    public static void MakeArray(int size,int range) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            ArrayList<Integer> testArr = new ArrayList<Integer>();
            

            for (int i = 0; i < size; i++) {
                testArr.add((int) (Math.random() * range));
            }
            Collections.sort(testArr);
            for (int i = 0; i < size; i++) {
               fileWriter.write(testArr.get(i)+"\t");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }

    }
}