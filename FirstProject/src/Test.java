import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter height in feet: ");
    double height = sc.nextDouble();

    System.out.println(" the conversion from feet to meters is : ");
    double meters = height*0.3048;
        System.out.println(meters);

    }}
