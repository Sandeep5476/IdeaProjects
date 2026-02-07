import java.util.Scanner;
//bruteforce approach
public class FindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        int min = n1 < n2 ? n1 : n2;
        int gcd=1;
        for(int i = min;i>=1;i--){
            if(n1 % i == 0 && n2 % i == 0){
                gcd=i;
                break;
            }
        }
        System.out.println("The GCD of "+n1+" and "+n2+" is: "+gcd);
    }
}
