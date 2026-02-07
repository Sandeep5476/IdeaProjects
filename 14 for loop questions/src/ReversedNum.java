import java.util.Scanner;

public class ReversedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int reversedNum=0;
        for(;n != 0;n/=10){
            int remainder = n %10;
            reversedNum = reversedNum*10 + remainder;
        }
        System.out.println("The reversed number is: "+reversedNum);
    }
}
