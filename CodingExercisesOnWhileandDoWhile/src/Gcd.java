import java.util.Scanner;

public class Gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter a  second number: ");
        int n2=sc.nextInt();
        int min=0,gcd;
        if(n1<n2){
             min=n1;
        }
        else {
            min=n2;
        }
        gcd=min;
        for(int i=min;i<=1;i--){
            if(n1 % i == 0 && n2 % i ==0){
                gcd=i;

            }
        }
        System.out.println("The greatest common divisior is: "+gcd);
    }
}
