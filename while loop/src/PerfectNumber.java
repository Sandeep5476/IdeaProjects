import java.util.Scanner;
//perfect numbers are numbers which are greater than 1

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive number!!!!");
        } else {
            int sum = 0;
            System.out.print("The proper divisors of "+n+" are: ");
            for (int i = 1; i <= n / 2; i++) {

                if (n % i == 0) {
                    System.out.print(i+" ");
                    sum = sum + i;
                }
            }
            if (sum == n) {
                System.out.println("\n"+n + " is a perfect number");
            } else {
                System.out.print("\n"+n + " is not a perfect number");
            }
        }
    }
}
