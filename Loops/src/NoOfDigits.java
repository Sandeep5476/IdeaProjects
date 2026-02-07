import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        if (n == 0) {
            count = 1;

        } else {
            for (; n != 0; n /= 10) {
                int rem = n % 10;
                count++;
            }
        }
        System.out.println(n+" has "+count+" digits");
    }
}
