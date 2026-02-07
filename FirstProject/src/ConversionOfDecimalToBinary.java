import java.util.Scanner;

public class ConversionOfDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, i;
        int[] Binary = new int[32];
        System.out.print("Enter positive number: ");
        x = sc.nextInt();
        for (i = 0; i < 32; i++) {
            Binary[31 - i] = x % 2;
            System.out.print(Binary[i]);
            x = x / 2;
        }

    }}