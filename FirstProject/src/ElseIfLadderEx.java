import java.util.Scanner;

public class ElseIfLadderEx {
    public static void main(String[] args) {
        int num1,num2;
        int choice;
        System.out.println("enter 1 for addition\nenter 2 for subtraction"+"\nenter 3 for multiplication\nenter 4 for division\nenter 5 for modulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice: ");
         choice = sc.nextInt();
        if(choice < 1 || choice > 5){
            System.out.println("invalid choice!!!");
        }else {
            System.out.println("enter first number: ");
            num1 = sc.nextInt();
            System.out.println("enter second number: ");
            num2 = sc.nextInt();

            if (choice == 1) {
                int sum = num1 + num2;
                System.out.println("the addition of two numbers is: " + sum);
            } else if (choice == 2) {
                int sub = num1 - num2;
                System.out.println("the subtraction of two numbers is: " + sub);
            } else if (choice == 3) {
                int mul = num1 * num2;
                System.out.println("the multiplication of two numbers is: " + mul);
            } else if (choice == 4) {
                int div = num1 / num2;
                System.out.println("the division of two numbers is: " + div);
            } else if (choice == 5) {
                int mod = num1 % num2;
                System.out.println("the modulo of two numbers is: " + mod);
            }

        }


    }

}
