import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
            if(i % 2 == 0){
             sum = sum+i;
            }

        }System.out.println("The sum of even numbers from 0 to "+num+ " = "+sum);
    }
}
