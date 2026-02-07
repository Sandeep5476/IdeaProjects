import java.util.Scanner;

public class DoWhileLoopEX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Enter a  first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = sc.nextInt();
        int choice;
        do{
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for muliplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 for modulo division");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("The addition is "+(num1+num2));
                    break;
                case 2 :
                    System.out.println("The subtration is "+(num1- num2));
                    break;
                case 3 :
                    System.out.println("The multiplicatin is "+(num1 *num2));
                    break;
                case 4:
                    System.out.println("The division is "+(num1/num2));
                    break;
                case 5:
                    System.out.println("the modulo is "+(num1%num2));
                    break;
                case 6:
                    System.out.println("Exit");


            }

        }while(choice != 6);

    }
}
