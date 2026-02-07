import java.util.Scanner;

public class PatternFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int n = sc.nextInt();
       /* //upperhalf
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lowerhalf
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        // 2nd method
        for(int i =1;i<2*n-1;i++){
            int noOfStars = i;
            if(i>n){
                noOfStars=2*n-i;
            }
            for(int j = 1;j<=noOfStars;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
