import java.util.Scanner;

public class Vote {
    static void vote(int age){
        if(age>=18){
            System.out.println("Eligible to vote!!");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age: ");
        int age = sc.nextInt();
        vote(age);
    }
}
