import java.util.Scanner;

public class LargestElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no.of cols: ");
        int cols =sc.nextInt();
        int[][] myArray = new int[rows][cols];
        //Taking input for the matrix
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                myArray[i][j] = sc.nextInt();
            }
        }
        //printing 2D array
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        //find the largest element in the matrix
        int maxElement=Integer.MIN_VALUE; //instead of taking 0 or 1
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(myArray[i][j] > maxElement){
                   maxElement = myArray[i][j];
               }
            }
        }
        System.out.println("The maximum element of the matrix is: "+maxElement);
    }
}
