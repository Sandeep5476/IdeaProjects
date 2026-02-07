import java.util.Scanner;

public class TransposeOf2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no.of cols: ");
        int cols = sc.nextInt();
        int[][] myArray = new int[rows][cols];
        //for taking the input of matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                myArray[i][j] = sc.nextInt();
            }
        }
        //for printing the matrix
        System.out.println("The matrix form of entered elements is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        //logic for transpose of matrix
        System.out.println("The transposed matrix is: ");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(myArray[j][i]+" ");
            }
            System.out.println();
        }
    }
}
