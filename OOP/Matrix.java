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
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        // Read two matrices
        Scanner sc = new Scanner(System.in);
        Matrix matrix1 = new Matrix();
        matrix1.readMatrix(sc);
        Matrix matrix2 = new Matrix();
        matrix2.readMatrix(sc);

        // Add the matrices if they are of the same order
        if (matrix1.rows != matrix2.rows || matrix1.cols != matrix2.cols) {
            System.out.println("The matrices cannot be added.");
            return;
        }
        Matrix sum = new Matrix();
        sum.rows = matrix1.rows;
        sum.cols = matrix1.cols;
        sum.matrix = new int[sum.rows][sum.cols];
        for (int i = 0; i < sum.rows; i++) {
            for (int j = 0; j < sum.cols; j++) {
                sum.matrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
            }
        }


        // Display the matrices
        System.out.println("Matrix 1:");
        matrix1.displayMatrix();
        System.out.println("Matrix 2:");
        matrix2.displayMatrix();
        System.out.println("Sum: ");
        sum.displayMatrix();
    }

}
