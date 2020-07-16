import java.util.ArrayList;

class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int index = 0;

        while (index < arr.length) {
            if (arr[index] == 0) { // add an additional zero given that I've seen one already
                al.add(arr[index]);
                al.add(0);
                index++;
            } else { // otherwise copy the element
                al.add(arr[index]);
                index++;
            }
        }
        index = 0;
        while (index < arr.length) { // rewrite the original array opto the array size
            arr[index] = al.get(index);
            index++;
        }
    }
}