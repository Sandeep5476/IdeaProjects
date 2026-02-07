import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        int result=1;
        for(int i =1;i<=power;i++){
            result = result*n;
        }
        System.out.println("The result is: "+result);
    }
}
