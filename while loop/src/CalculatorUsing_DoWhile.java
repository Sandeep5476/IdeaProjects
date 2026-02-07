import java.util.Scanner;

public class CalculatorUsing_DoWhile {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 to 6 for calculations: ");
        int choice,num1,num2;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter no.1 for addition: ");
            System.out.println("Enter no.2 for subtraction");
            System.out.println("Enter no.3 for multiplication");
            System.out.println("Enter no.4 for division");
            System.out.println("Enter no.5 for modulo division");
            System.out.println("Enter no.6 for exit the calculator");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter two numbers for addition: ");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    System.out.println("the addition is: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Enter two numbers for subtraction: ");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    System.out.println("the subtraction is: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Enter two numbers for multiplication: ");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    System.out.println("the multiplication is: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Enter two numbers for division: ");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    if(num2==0){
                        System.out.println("it tends to infinity or unproper behaviour");
                    }
                    else{
                        System.out.println("the division is: "+(num1/num2));
                    }
                    break;
                case 5:
                    System.out.println("Enter two numbers for modulo division: ");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    System.out.println("the modulo division  is: "+(num1%num2));
                    break;
                case 6:
                    System.out.println("Exiting the calculator....");
                default:
                    System.out.println("Invalid choice and try again!!");
            }
        }while(choice!=6);
    }

}
