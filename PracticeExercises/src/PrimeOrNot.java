import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to check prime or not: ");
        int num = sc.nextInt();
        boolean IsPrime=true;
        if(num<=1){
            System.out.println(num+"is not a prime number");
        }
        else{
            for(int i = 2;i<=Math.sqrt(num);i++){ //  if 10 i will be 2,3,4,5,6,7,8,9
                if(num % i == 0){
                    System.out.println(num+" is a not a prime number");
                    IsPrime = false;
                    break;
                }

            }
            if(IsPrime){
                System.out.println(num+ " is a prime number");

            }
        }
    }
}
