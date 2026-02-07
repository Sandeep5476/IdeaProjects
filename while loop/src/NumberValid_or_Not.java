import java.util.Scanner;

public class NumberValid_or_Not {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1-50");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        while(num < 1 || num>50){
            System.out.println("Invalid number \nplease enter a valid number: ");
            num=sc.nextInt();
        }
        System.out.println("you entered correct number: "+num);
    }
}
