// 4. Read a matrix from the console and check whether it is symmetric or not.

import java.util.Scanner;

public class SymmetricMatrix {
    
    public static void main(String[] args) {

        // Read the matrix from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Check for symmetry
        boolean symmetric = true;
        if (rows != cols) {
            symmetric = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
            }
        }

        // Print the result
        String ans = (symmetric) ? "Symmetric.": "Not Symmetric.";
        System.out.println("The matrix is " + ans);

    }

}
