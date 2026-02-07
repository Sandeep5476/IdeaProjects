import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int Originaln1 = n1;
        int Originaln2 = n2;
        int temp;
        while(n2 != 0){
            temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        System.out.println("The greatest common divisior of two numbers is: "+n1);
        int lcm = (Originaln1*Originaln2)/n1;
        System.out.println("The lcm of two numbers is: "+lcm);



    }
}
