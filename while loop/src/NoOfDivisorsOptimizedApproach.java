import java.util.Scanner;

public class NoOfDivisorsOptimizedApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                if(i == n/i){
                    count++;
                }else{
                    count += 2;
                }
            }
        }
        System.out.print("the count of no.of divisors are: "+count);
    }
}
