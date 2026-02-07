import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no.of cols: ");
        int cols = sc.nextInt();
        System.out.println("Enter the elements");
        int[][] myArray = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                myArray[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix form of entered elements are: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
