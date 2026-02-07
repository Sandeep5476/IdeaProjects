import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reversedNum=0;
        for(;n != 0;n/=10){
            int rem=n%10;
            reversedNum=reversedNum*10+rem;
        }
        System.out.println("The reversed number is : "+reversedNum);
    }


}
