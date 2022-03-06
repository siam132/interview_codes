/**
 * Given an m x n matrix. If an element is 0, set its entire row and column to
 * 0. Do it in-place.
 */

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] matrix = { { 0, 2, 0 }, { 1, 5, 3 }, { 1, 2, 4 } };
        setZeroes(matrix);

        for (int[] row : matrix) {
            for (int elm : row)
                System.out.print(elm + " ");
            System.out.println();
        }

    }

    public static void setZeroes(int[][] matrix) {
        int row = 0;
        int col = 0;

        while (row < matrix.length && col < matrix[0].length) {
            for (int i = col; i < matrix[0].length; i++) {
                if (matrix[row][i] == 0) {
                    setColZero(matrix, i);
                    setRowZero(matrix, row);
                    row++;
                    col++;
                }
            }
            row++;
        }
    }

    public static void setRowZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    public static void setColZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
