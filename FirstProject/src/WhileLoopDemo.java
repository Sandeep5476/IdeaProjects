import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 50 : ");
        int num =  sc.nextInt();
        while(num < 1 || num > 50){
            System.out.println("Please enter a valid number");
            num=sc.nextInt();
        }
        System.out.println("You entered "+num+" is a valid number which is in the range between 0 to 50");

    }
}
