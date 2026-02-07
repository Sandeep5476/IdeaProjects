import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number between 1 to 50 : ");
            num=sc.nextInt();
            if(num<1 || num>50)
                System.out.println(num+" is Invalid number");
        }while(num<1 || num>50);
        System.out.println("You entered number is valid number");
    }
}
