import java.util.Scanner;
//wap to find frequency of each element in the array
public class problem2 {
    public static void main(String[] args) {
        System.out.print("enter size of an array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.println(i);
        }


    }
}
