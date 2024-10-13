import java.util.*;

public class Matrices_2D {
    // ----------------------------------------------3*3_Matrix-------------------------------------------

    // public static void main(String[] args) {
    // int matrix[][] = new int[3][3];
    // int n = matrix.length, m = matrix[0].length;

    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // matrix[i][j] = sc.nextInt();

    // }
    // }

    // //output
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix.length; j++) {
    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();
    // }

    // }
    // }

    // ---------------------------------------------Martix_with_key-----------------------------------------

    // public static boolean Search(int matrix[][], int key) {
    // int n = matrix.length, m = matrix[0].length;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix[i][j] == key) {
    // System.out.println("key found (" + i + "," + j + ")");
    // return true;
    // }

    // }
    // }
    // System.out.println("key not found");
    // return false;
    // }

    // public static void main(String args[]) {
    // int matrix[][] = new int[3][3];
    // Scanner sc = new Scanner(System.in);

    // // output
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix.length; j++) {
    // matrix[i][j] = sc.nextInt();
    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();
    // }
    // Search(matrix, 5);
    // }
    // }

    // ------------------------------------------Spiral_Matrix------------------------------------------

    // public static void printSpiral(int matrix[][]) {
    // int startRow = 0;
    // int startCol = 0;
    // int endRow = matrix.length - 1;
    // int endCol = matrix[0].length - 1;

    // while (startRow <= endRow && startCol <= endCol) {
    // // Right
    // for (int j = startCol; j <= endCol; j++) {
    // System.out.print(matrix[startRow][j] + " ");
    // }
    // // bottom
    // for (int i = startRow + 1; i <= endRow; i++) {
    // System.out.print(matrix[i][endCol] + " ");
    // }
    // // left
    // for (int j = endCol-1; j >= startCol; j--) {
    // if (startRow == endRow) {
    // break;
    // }
    // System.out.print(matrix[endRow][j] + " ");
    // }
    // // top
    // for (int i = endRow - 1; i >= startRow + 1; i--) {
    // if (startCol == endCol) {
    // break;
    // }
    // System.out.print(matrix[i][startCol] + " ");

    // }
    // startCol++;
    // startRow++;
    // endCol--;
    // endRow--;
    // }
    // System.out.println();

    // }

    // public static void main(String[] args) {
    // int matrix[][] = { { 1, 2, 3, 4 },
    // { 5, 6, 7, 8 },
    // { 9, 10, 11, 12 },
    // { 13, 14, 15, 16 } };

    // printSpiral(matrix);
    // }
    // }

    // --------------------------------------Diagonal_Sum----------------------------------------

    // public static int daigonalSum(int matrix[][]) {
    // int sum = 0;

    // for(int i = 0; i< matrix.length; i++){
    // for(int j = 0; j< matrix[0].length; j++){
    // if (i==j) {
    // sum += matrix[i][j];
    // }
    // else if (i+j == matrix.length-1) {
    // sum += matrix[i][j];

    // }
    // }
    // }
    // return sum;
    // }
    // public static void main(String[] args) {
    // int matrix[][] = { { 1, 2, 3, 4 },
    // { 5, 6, 7, 8 },
    // { 9, 10, 11, 12 },
    // { 13, 14, 15, 16 } };
    // System.out.println(daigonalSum(matrix));
    // }
    // }

    // ---------------------------------StairCase_Search----------------------------------------

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key Found at:(" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 33;
        staircaseSearch(matrix, key);
    }
   }
