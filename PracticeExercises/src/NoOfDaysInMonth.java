import java.util.Scanner;

public class NoOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter month number: ");
        int MonthNumber = sc.nextInt();
        int days = switch(MonthNumber){
            case 1,3,5,7,8,10,12 :
                yield 31;
            case 4,6,9,11 :
                yield 30;
            case 2 :
                System.out.println("enter year");
                int year = sc.nextInt();
                if(year % 400 == 0 || (year % 4 == 0 && year % 10 != 0) ){
                    yield 29;
                }else
                    yield 28;
            default :
                System.out.println("invalid month number");
                yield -1;
        };
        System.out.println(days);
    }
}
