package PatternPrinting;

import java.util.Scanner;

public class Pattern2 {

    static void pattern15(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern19(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern20(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern21(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<2*i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //same but second way , we took another extra variable num
    static void pattern21I(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    //try out outer loop with for(int i=1;i<=n;i++) for below code assignment
    static void pattern22(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void newPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=n;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
    static void pattern23(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern24(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
    static void pattern25(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern27(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2 == 1){
                    System.out.print("A"+" ");
                }else{
                    System.out.print("B"+" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern26(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                System.out.print(n-(Math.min(Math.min(j,(2*n-2)-j),Math.min(i,(2*n-2)-i)))+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int n=sc.nextInt();
        //pattern17(n);
        //pattern21I(n);
        //pattern23(n);
        pattern26(n);
        //pattern27(n);

    }
}
