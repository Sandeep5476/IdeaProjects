import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int revNum=0;
        for(;num!=0;num/=10){
            int rem = num%10;
             revNum = revNum*10+rem;
        }
        if(revNum == originalNum){
            System.out.println(revNum+"the number is a palindrome");
        }else{
            System.out.println(revNum+" is not a palindrome");
        }
    }
}
