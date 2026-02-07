import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int max = n1 > n2 ? n1 : n2;
        int lcm= max;
        while(true){
            if(lcm %  n1 == 0 && lcm % n2 == 0){
                break;
            }
            lcm += max;
        }
        System.out.println("The lcm of "+n1+" and "+ n2+" is: "+lcm);
    }
}
