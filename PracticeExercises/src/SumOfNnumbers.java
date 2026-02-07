import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sums = 0;
        for(int i = 0;i<=n;i++){
             sums = sums+i;
        }
        System.out.println(sums);
    }
}
