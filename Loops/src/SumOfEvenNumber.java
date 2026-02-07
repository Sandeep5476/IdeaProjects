//wap to print sum of even numbers

import java.util.Scanner;
/*
public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sumEven = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sumEven = sumEven+i;

            }
        }System.out.println("The sum of even numbers of given range is: "+sumEven);
    }
}
*/

//even numbers are not only positive numbers -45 is also a negative even  number
//w.a.p to find even numbers from -45 to +45
public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of starting value: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending value: ");
        int end = sc.nextInt();
        int sumEven = 0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                sumEven = sumEven+i;

            }
        }System.out.println("The sum of even numbers of given range is: "+sumEven);
    }
}