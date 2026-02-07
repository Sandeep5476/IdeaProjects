import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        for(int i=0;i< arr.length;i++){ // for(int i=0;i<arr.length;i++)
            arr[i]= sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){ // for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        }

    }
}
