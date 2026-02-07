public class Assignment4 {
    static int a = 100;
    static double b = 200;
    static int sum = (int)(a+b);// the operand 'b' is double type so total expression is double
//possible lossy conversion from double to int
    public static void main(String[] args) {
        System.out.println("the sum is: "+sum);
    }
    }

