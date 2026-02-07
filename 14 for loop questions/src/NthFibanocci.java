import java.util.Scanner;

public class NthFibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n value: ");
        int n=sc.nextInt();
        int firstTerm=0,secondTerm=1;
        if(n<1){
            System.out.println("please enter a valid number");
        }else if(n == 1){
            System.out.println("The fibanocci series is "+firstTerm);
        }else{
            System.out.print("The fibanocci series is "+firstTerm+" "+secondTerm);
            for(int i=3;i<=n;i++){
                int nextTerm = firstTerm+secondTerm;
                System.out.println(" "+nextTerm);
                firstTerm=secondTerm;
                secondTerm=nextTerm;
            }
        }
        System.out.print(n+" th fibanocci number is: "+secondTerm);
    }
}
