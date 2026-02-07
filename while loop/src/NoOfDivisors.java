import java.util.Scanner;

public class NoOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check no of divisors: ");
        int n = sc.nextInt();
        int count=0;
        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }
        System.out.println("The no of divisors of "+n+" is: "+count);
    }
}
