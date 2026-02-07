import java.util.Scanner;

public class NumberValid_using_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter a number between 1 to 50: ");
            num=sc.nextInt();
            if(num <1 || num >50){
                System.out.println("please enter a valid number: ");
                num=sc.nextInt();
            }
            else{
                System.out.println("you entered correct number");
            }
        }while(num<1 || num>50);
    }
}
