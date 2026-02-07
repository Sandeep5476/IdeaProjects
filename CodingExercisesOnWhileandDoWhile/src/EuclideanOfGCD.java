import java.util.Scanner;

public class EuclideanOfGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
         int n1=sc.nextInt();
        System.out.print("Enter a  second number: ");
         int n2=sc.nextInt();
        int temp;
        while(n2!=0){
            temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        System.out.println(n1);
    }
}
