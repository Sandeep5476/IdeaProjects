package PatternPrinting;

import java.util.Scanner;

public class Pattern3 {
    static void pattern27(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }
    static void pattern29(int n){
        for(int i=n;i>=1;i--){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    //one method
    static void pattern31(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            for(int j=2;j<=i;j++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    //second method like star pattern
    static void pattern31I(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch);
                if(j<=(2*i-1)/2){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
    static void p1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i % 2 == 1){
                    System.out.print("A");
                }
                else{
                    System.out.print("B");
                }
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print('C');
                }else if(j==2){
                    System.out.print('O');
                }else if(j==3){
                    System.out.print('D');
                }else if(j==4){
                    System.out.print('E');
                }else if(j==5){
                    System.out.print('R');
                }
            }
            System.out.println();
        }
    }
    static void p3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print('R');
                }else if(j==2){
                    System.out.print('E');
                }else if(j==3){
                    System.out.print('D');
                }else if(j==4){
                    System.out.print('O');
                }else if(j==5){
                    System.out.print('C');
                }
            }
            System.out.println();
        }
    }
    static void p4(int n){
        int ch='A';
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)ch);
            }
            ch+=i;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int n=sc.nextInt();
        p4(n);
    }
}
