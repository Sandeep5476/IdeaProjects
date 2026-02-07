import java.util.Scanner;

public class SwitchCode {
    public static void main(String[] args) {
        System.out.println("enter grade of a student");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if(grade >100 || grade<0) {
            System.out.println("invalid score");
        }else{
            String result = switch (grade/10) {
                case 9,10 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                case 6 -> "D"; //{yield "D";}
                default ->  "Fail";

            };
            System.out.println(result);
        }

    }
}