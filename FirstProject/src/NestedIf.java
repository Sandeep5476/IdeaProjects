import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter even number to check whether it is even or not");
        int num = sc.nextInt();
        if(num % 2 == 0){
            if(num % 2 == 0){
                System.out.println("you entered number is positive");
            }
            }else{
            System.out.println("you entered number is odd");
        }
    }
}
