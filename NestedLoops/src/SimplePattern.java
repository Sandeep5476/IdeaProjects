import java.util.Scanner;

public class SimplePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no.of columns: ");
        int cols = sc.nextInt();

//        for(int i = 1;i<=rows;i++){
//            for(int j = 1;j<=cols;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //using while loop
        int i=1;
        while(i<=rows){
            int j=1;
            while(j<=cols){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
