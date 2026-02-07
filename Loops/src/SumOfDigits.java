import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int Originalnum=num;
        int sum = 0;
        for(;num!=0;num/=10){
            int rem = num%10;
            sum = sum+rem;
        }
        System.out.println("The sum of digits of "+Originalnum+" = "+sum);
    }
}
