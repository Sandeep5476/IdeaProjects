import java.util.Scanner;

public class VoteEx {
    public static void main(String[] args){
        int age;
        boolean IsCitizen;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        age = sc.nextInt();
        if(age<18){
            System.out.println("you are too young to vote!!!");
        }else {
            System.out.println("are you citizen of india ? ");
            IsCitizen = sc.nextBoolean();
            if (age >= 18) {
                if (IsCitizen) {
                    System.out.println("eligible to vote");
                } else {
                    System.out.println("apply for indian citizenship");
                }
            }
        }
    }
}
