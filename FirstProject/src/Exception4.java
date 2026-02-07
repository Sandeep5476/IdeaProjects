import java.util.Scanner;
//square root of number exception
public class Exception4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n < 0)
                throw new IllegalArgumentException("can not find square root for negative number number");
            else
                System.out.println(Math.sqrt(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
