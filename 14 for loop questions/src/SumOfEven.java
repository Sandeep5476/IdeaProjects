import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting value: ");
        int start=sc.nextInt();
        System.out.print("Enter ending value: ");
        int end= sc.nextInt();
        int sum=0;
        for(int i=start;i<= end;i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum between the given range is: "+sum);
    }
}
