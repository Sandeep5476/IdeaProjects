import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a=n;
        int count=0;
        for(;n!=0;n/=10){
            int rem=n%10;
            count++;
        }
        System.out.println( "The total digits in "+a+" is "+ count );
    }
}
