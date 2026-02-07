import java.util.Scanner;
public class MM_NEW{
        static int r2, c2, i, j;
        // Function to convert 2x2 matrix to 2x1 by summing each row
        public static int[][] convertTo2x1(int[][] matrix) {
            int[][] result = new int[2][1];
            for (int i = 0; i < 2; i++) {
                result[i][0] = matrix[i][0] + matrix[i][1];  // Sum the elements of each row
            }
            return result;  // Return the 2x1 matrix
        }

        // Method to swap two columns in a matrix
        public static void swap(int mat[][]) {
            for (int i = 0; i < r2; i++) {
                int temp = mat[i][0];  // Store the value of the first column
                mat[i][0] = mat[i][1];  // Assign the value of the second column to the first column
                mat[i][1] = temp;  // Assign the stored value to the second column
            }
        }

        // Transpose method: returns void and modifies the matrix t
        public static void transpose(int mat[][], int t[][]) {
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    t[j][i] = mat[i][j];  // Correct transpose logic
                }
            }
        }

        // Method to perform matrix multiplication (element-wise)
        public static void mul(int a[][], int b[][], int result[][]) {
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    result[i][j] = a[i][j] * b[i][j];  // Multiply corresponding elements
                }
            }
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int r1, c1;
            int a[][] = new int[10][10];
            int b[][] = new int[10][10];
            int c[][] = new int[10][10];  // Matrix to store the multiplication result
            int transposeMatrix[][] = new int[10][10];  // Matrix to store the transpose

            // Input for Matrix A
            System.out.print("Enter number of rows in A: ");
            r1 = sc.nextInt();
            System.out.print("Enter number of columns in A: ");
            c1 = sc.nextInt();
            System.out.println("Enter elements of A:");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            // Input for Matrix B
            System.out.print("Enter number of rows in B: ");
            r2 = sc.nextInt();
            System.out.print("Enter number of columns in B: ");
            c2 = sc.nextInt();
            System.out.println("Enter elements of B:");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            // Call transpose function
            transpose(b, transposeMatrix);

            // Multiply matrices and store result in c
            mul(a, transposeMatrix, c);

            // Convert the result matrix c to a 2x1 matrix
            int[][] resultC = convertTo2x1(c);

            // Swap columns of matrix B
            swap(b);

            // Transpose the swapped matrix B and multiply
            transpose(b, transposeMatrix);
            int[][] d = new int[10][10];
            mul(a, transposeMatrix, d);  // Store the result of multiplication in d

            // Convert the result matrix d to a 2x1 matrix
            int[][] resultD = convertTo2x1(d);

            // Combine results into matrix E
            int e[][] = new int[2][2];
            e[0][0] = resultC[0][0];
            e[0][1] = resultD[0][0];
            e[1][0] = resultD[1][0];
            e[1][1] = resultC[1][0];

            // Print matrix E
            System.out.println("Matrix E:");
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    System.out.print(e[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

