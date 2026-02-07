import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            System.out.println(num+" is not a prime number");
        }else{
            for(int i =2;i<=Math.sqrt(num);i++){
                if(num%i==0) {
                    System.out.println("number is not a prime number: ");
                    isPrime=false;
                    break;
                }
            }if(isPrime)
            System.out.println("number is a prime");
        }

    }
}
