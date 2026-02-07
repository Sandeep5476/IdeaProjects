import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no.of rows of matrix1: ");
        int r1=sc.nextInt();
        System.out.print("Enter no.of cols of matrix1:");
        int c1=sc.nextInt();
        int[][] m1 = new int[r1][c1];

        System.out.print("Enter no.of rows of matrix2: ");
        int r2=sc.nextInt();
        System.out.print("Enter no.of cols of matrix2:");
        int c2=sc.nextInt();
        int[][] m2 = new int[r2][c2];

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible! Columns of Matrix 1 must equal Rows of Matrix 2.");
            return;
        }
        //giving input to matrix1
        System.out.println("Enter the elements of  matrix1");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j] = sc.nextInt();
            }
        }
        //giving input to matrix2
        System.out.println("Enter the elements of  matrix2");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j] = sc.nextInt();
            }
        }
        //printing matrix1
        System.out.println("The first matrix is: ");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        //printing matrix2
        System.out.println("The second matrix is: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        //logic for matrix multiplication
        int[][] m3=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<c1;k++){
                    sum=sum+(m1[i][k]*m2[k][j]);
                    m3[i][j]=sum;
                }
            }
        }
        //displaying resultant matrix
        System.out.println("The multiplication of two matrices is: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
