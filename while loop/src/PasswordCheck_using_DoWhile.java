import java.util.Scanner;

public class PasswordCheck_using_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CorrectPassword="SANDEEP";
        String EnteredPassword;
        do{
            System.out.println("Enter the password: ");
            EnteredPassword = sc.nextLine();
            if(!(EnteredPassword.equals(CorrectPassword))){
                System.out.println("incorrect password and Try again.....");
            }else{
                System.out.println("you entered correct password");
            }
        }while(!(EnteredPassword.equals(CorrectPassword)));


    }
}
