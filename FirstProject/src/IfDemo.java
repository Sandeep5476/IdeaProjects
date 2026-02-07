import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter a positive number");
       int number = sc.nextInt();
//        if(number >= 0)
//            System.out.println("you entered number is postive");

       // number is even,positive or zero
     if(number % 2 == 0){
         System.out.println("You entered number is : even!! ");
     }
     if(number > 0)
         System.out.println("You enterred number is positive!!");
     if(number == 0)
         System.out.println("The number is zero!");

   }
}
