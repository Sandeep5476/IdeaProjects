import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int originalNumb=n;
        int sum=0;
        for(;n != 0;n/=10){
            int remainder = n %10;
            sum+=remainder;
        }
        System.out.println("The sum of each digit of "+originalNumb+" is: "+sum);
    }
}
