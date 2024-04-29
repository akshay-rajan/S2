// 2. Read 2 matrices from the console and perform matrix addition.

import java.util.Scanner;

public class Matrix {

    int rows, cols;
    int[][] matrix;

    // Read a matrix
    public void readMatrix(Scanner sc) {
        System.out.println("Enter the number of rows and columns: ");

        // Read the values into the current object
        this.rows = sc.nextInt();
        this.cols = sc.nextInt();
        this.matrix = new int[this.rows][this.cols];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Display a matrix
    public void displayMatrix() {
        for (int[] row: matrix) {
            for (int element: row)
                System.out.print(element + " ");
            System.out.println();
        }
    }

    // Add two Matrices
    void add(Matrix matrix1, Matrix matrix2) {
        // Check if the matrices are of the same order
        if (matrix1.rows != matrix2.rows || matrix1.cols != matrix2.cols) {
            System.out.println("The matrices cannot be added.");
            return;
        }
        this.rows = matrix1.rows;
        this.cols = matrix1.cols;
        this.matrix = new int[this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.matrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
            }
        }
    }
    
    public static void main(String[] args) {
        
        // Read two matrices
        Scanner sc = new Scanner(System.in);
        Matrix matrix1 = new Matrix();
        matrix1.readMatrix(sc);
        Matrix matrix2 = new Matrix();
        matrix2.readMatrix(sc);

        // Add the matrices
        Matrix sum = new Matrix();
        sum.add(matrix1, matrix2);

        // Display the matrices
        System.out.println("Matrix 1:");
        matrix1.displayMatrix();
        System.out.println("Matrix 2:");
        matrix2.displayMatrix();
        System.out.println("Sum: ");
        sum.displayMatrix();

    }

}
