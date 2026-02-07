import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter n value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;

        if (n < 1) {
            System.out.println("enter a positive number!!!");
        } else if (n == 1) {
            System.out.println("The fibanocci series is: " + firstTerm);
        } else {
            System.out.print("The fibanocci Series is: " + firstTerm + " " + secondTerm);
            for (int i = 3; i <= n; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(" " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}