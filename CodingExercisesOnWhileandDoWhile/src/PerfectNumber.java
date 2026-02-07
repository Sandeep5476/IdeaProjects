import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        if(num<1){
            System.out.println("please enter a valid number!!!");
        }
        for(int i=1;i<=num/2;num++){
            if(num % i == 0){
                sum = sum+i; 
            }
        }
        if(sum==num){
            System.out.println(num+" is a perfect number");
        }else{
            System.out.println(num+" is not a perfect number");
        }
    }
}
