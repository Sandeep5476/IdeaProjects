import java.util.Scanner;
//prime numbers are number greater than 1 and are divisible by 1 and itself
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not: ");
        int n = sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            System.out.println("Please enter a positive number");
        }
        else{
            for(int i=2;i<n;i++){//bruteforce approach
                //for(int i=2;i<=n/2;i++)
                //for(int i=2;i<=Math.sqrt(n);i++)

                if(n%i == 0) {
                    System.out.println(n + " is not a prime number");
                    isPrime=false;
                    break;
                }
            }if(isPrime){
                System.out.println(n+" is a prime number");
            }

        }
    }
}
