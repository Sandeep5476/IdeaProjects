import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        byte f1 = sc.nextByte();
        System.out.println("enter second number: ");
        byte f2 = sc.nextByte();
        System.out.println("the sum of two number is: ");
        byte sum = (byte)(f1+f2);
        System.out.println(sum);
    }
}