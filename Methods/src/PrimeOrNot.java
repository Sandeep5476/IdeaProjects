import java.util.Scanner;

public class PrimeOrNot {

    static void prime(int a){
        boolean isPrime=true;
        if(a<=1){
            System.out.println("Please enter a postitive number!!!");
            return;
        }else{
            for(int i = 2;i<=a/2;i++){
                if(a%i==0){
                    System.out.println(a+" is not a prime number!!");
                    isPrime=false;
                    break;
                }
            }if(isPrime){
                System.out.println(a+" is a prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n=sc.nextInt();
        prime(n);
        prime(11);
        prime(12);
        prime(-13);
        prime(n);
    }
}
