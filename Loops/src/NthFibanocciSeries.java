import java.util.Scanner;

public class NthFibanocciSeries {
    public static void main(String[] args) {
        System.out.print("Enter n value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        if (n <= 0) {
            System.out.println("Enter a correct number");
        } else if (n == 1)
            System.out.println("The fibanocci series is: " + firstTerm);
        else {
            for (int i = 3; i <= n; i++) {
                int nextTerm = firstTerm + secondTerm;

                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println("The " + n + "th fibanoci number is " + secondTerm);
        }
    }
}