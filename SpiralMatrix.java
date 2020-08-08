import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {

    /*
     * Given a matrix of m x n elements (m rows, n columns), return all elements of
     * the matrix in spiral order.
     */

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        System.out.println(spiralOrder(matrix).toString());
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> al = new ArrayList<Integer>(); // return list
        if (matrix.length == 0) // check for empty matrix
            return al;
        int top = 0; // keep track of the bounds and shrink it on every iteration
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int dir = 0; // 0 = right | 1 = down | 2 = left | 3 = up //using a variable to decide the
                     // direction of iteration

        while (top <= bottom && left <= right) { // while the four corners does not meet keep circling
            if (dir == 0) { // going left to right
                for (int i = left; i <= right; i++) {
                    al.add(matrix[top][i]);
                }
                top++; // increment top bound by 1
            } else if (dir == 1) { // going top to bottom
                for (int i = top; i <= bottom; i++) { // keep column static and row moving downwards
                    al.add(matrix[i][right]);
                }
                right--; // decrement right pointer
            } else if (dir == 2) { // going right to left
                for (int i = right; i >= left; i--) {
                    al.add(matrix[bottom][i]);
                }
                bottom--; // decrement bottom pointer
            } else if (dir == 3) { // going bottom to top
                for (int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
                left++; // increment left pointer
            }

            dir = (dir + 1) % 4; // change direction in cycle right->down->left->up
        }

        return al;

    }
}