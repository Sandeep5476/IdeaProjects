import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is palindrome or not: ");
        int n=sc.nextInt();
        int originalNumb=n;
        int reversedNum=0;
        for(;n != 0;n/=10){
            int remainder = n %10;
            reversedNum = reversedNum*10 + remainder;
        }
        if(originalNumb == reversedNum){
            System.out.println(originalNumb+" is a palindrome number!!!");
        }
        else{
            System.out.println(originalNumb+" is not a palindrome number");
        }
    }
}
