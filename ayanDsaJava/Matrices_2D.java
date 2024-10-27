import java.util.*;

public class Matrices_2D {
    // -----------------3*3_Matrix----------------------

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

    // ---------------Martix_with_key-------------

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

    // ----------Largest No in Matrix-----------

    // public static int Search(int matrix[][]) {
    // int largest = Integer.MIN_VALUE;
    // int n = matrix.length, m = matrix[0].length;

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix[i][j] > largest) {
    // largest = matrix[i][j];
    // }

    // }
    // }
    // return largest;

    // }

    // public static void main(String args[]) {
    // int matrix[][] = new int[3][3];
    // Scanner sc = new Scanner(System.in);

    // // output
    // System.out.println("Enter the elements of the matrix:");
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix.length; j++) {
    // matrix[i][j] = sc.nextInt();
    // }
    // }
    // int largest = Search(matrix);
    // System.out.println("The largest element in the matrix is: " + largest);
    // }

    // -----------------Spiral_Matrix---------------

    // public static void printSpiral(int matrix[][]) {
    // int startRow = 0;
    // int startCol = 0;
    // int endRow = matrix.length - 1;
    // int endCol = matrix[0].length - 1;

    // while (startRow <= endRow && startCol <= endCol) {
    // // Top
    // for (int j = startCol; j <= endCol; j++) {
    // System.out.print(matrix[startRow][j] + " ");
    // }
    // // Right
    // for (int i = startRow + 1; i <= endRow; i++) {
    // System.out.print(matrix[i][endCol] + " ");
    // }
    // // Bottom
    // for (int j = endCol - 1; j >= startCol; j--) {
    // if (startRow == endRow) {
    // break;
    // }
    // System.out.print(matrix[endRow][j] + " ");
    // }
    // // Left
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

    // ----------------------Diagonal_Sum----------------------

    // public static int daigonalSum(int matrix[][]) {
    // int sum = 0;

    // // primary (i=j)
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[0].length; j++) {
    // if (i == j) {
    // sum += matrix[i][j];
    // } else if (i + j == matrix.length - 1) {
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

    // ------------------Diagonal_Sum-(Optimozed)[O(n)]-------------------

    // public static int daigonalSum(int matrix[][]) {
    // int sum = 0;

    // // primary (i=j)
    // for (int i = 0; i < matrix.length; i++) {
    // // pd
    // sum += matrix[i][i];
    // // sd
    // if (i != matrix.length - 1 - i)
    // sum += matrix[i][matrix.length - i - 1];

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

    // -----------------StairCase_Search----------------

    // public static boolean staircaseSearch(int matrix[][], int key) {
    // int row = 0, col = matrix[0].length - 1;

    // while (row < matrix.length && col >= 0) {
    // if (matrix[row][col] == key) {
    // System.out.println("key Found at:(" + row + "," + col + ")");
    // return true;
    // }

    // else if (key < matrix[row][col]) {
    // col--;
    // } else {
    // row++;
    // }
    // }
    // System.out.println("key not found");
    // return false;
    // }

    // public static void main(String[] args) {
    // int matrix[][] = { { 10, 20, 30, 40 },
    // { 15, 25, 35, 45 },
    // { 27, 29, 37, 48 },
    // { 32, 33, 39, 50 } };

    // int key = 33;
    // staircaseSearch(matrix, key);
    // }

    // -----------------2D-Array Ques-----------------
    // -- Ques 1 : Print the number of 7’s that are in the 2d array.

    // public static int noArray(int matrix[][]) {
    // int n = matrix.length, m = matrix[0].length;
    // int count = 0;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix[i][j] == 7) {
    // count++;
    // }

    // }

    // }

    // // Print the modified array
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();
    // }
    // return count;
    // }

    // public static void main(String[] args) {
    // int[][] matrix = { { 4, 7, 8 }, { 8, 8, 7 } };
    // int totalSevens = noArray(matrix);
    // System.out.println("total 7 in Array: " + totalSevens);
    // }

    // -- Ques 2 : Print out the sum of the numbers in the second row of the “nums”
    // array.

    // public static int sumArr(int nums[][]) {
    // int m = nums[0].length;
    // int sum = 0;

    // for (int j = 0; j < m; j++) {
    // sum += nums[1][j];

    // }
    // return sum;
    // }

    // public static void main(String[] args) {
    // int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
    // int sum = sumArr(nums);
    // System.out.println(sum);
    // }

    // -- Ques 3 : Write a program to Find Transpose of a Matrix.
    public static int Transpose(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        int transpose[][] = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 11, 12, 13 }, { 21, 22, 23 } };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}