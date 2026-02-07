import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = num;i>=1;i--){
            fact = fact*i;
        }
//        int fact =1;
//        for(int i=1;i<=num;i++){
//            fact = fact*i;
//        }
        System.out.println("the factorial of "+num + " is " +fact);
    }
}
