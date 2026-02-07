import java.util.Scanner;

public class MultiplicationMethod {
    static void multiply(int a){
        for(int i=1;i<=20;i++){
            System.out.println(a+" X "+i+" = "+a*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        multiply(n);
    }
}
