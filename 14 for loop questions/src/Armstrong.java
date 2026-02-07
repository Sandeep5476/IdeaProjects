import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int n = sc.nextInt();
        int originalNum = n;
        double result = 0;
        int numDigits = String.valueOf(n).length(); // Get the number of digits

        while (n != 0) {
            int remainder = n % 10;
            result += Math.pow(remainder, numDigits);
            n /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number!");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
