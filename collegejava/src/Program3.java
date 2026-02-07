import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter the k value: ");
        int k=sc.nextInt();
        System.out.println("Enter array elements: ");
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                System.out.println(a[i]);
            }



    }
}
